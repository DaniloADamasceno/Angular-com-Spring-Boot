package com.aws.backend.resources;

import com.aws.backend.entities.Product;
import com.aws.backend.repository.ProductRepository;
import com.aws.backend.services.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductResources {


    //?-------------------------------------   INJECTION DEPENDENCY   --------------------------------------------------
    private final ProductRepository productRepository;
    private final ProductService productService;


    //?----------------------------------------------   CONSTRUCTOR   --------------------------------------------------
    public ProductResources(ProductRepository productRepository, ProductService productService) {
        this.productRepository = productRepository;
        this.productService = productService;
    }


    //?----------------------------------------------   METHODS   ------------------------------------------------------
    //FIND ALL BY ID
    @GetMapping(path = "/{id}")
    public ResponseEntity<List> findAllById(@PathVariable Long id) {
        List<Product> ProductTest;
        ProductTest = productService.findAllById(id);
        return ResponseEntity.ok().body(productRepository.findAllById(Collections.singleton(id)));
    }

    //FIND ALL
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> ProductTest = productService.findAll();
        return ResponseEntity.badRequest().body(ProductTest);
    }

    //SAVE
    @PostMapping
    public ResponseEntity<Product> save(Product product) {
        Product productTest = productService.save(product);
        return ResponseEntity.ok().body(productTest);
    }

    //DELETE BY ID
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        productService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
