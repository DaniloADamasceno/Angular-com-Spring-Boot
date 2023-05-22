package com.aws.backend.services.implement;

import com.aws.backend.entities.Product;
import com.aws.backend.repository.ProductRepository;
import com.aws.backend.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplements implements ProductService {

    //?----------------------------------------------   INJECTIONS DEPENDENCY   ----------------------------------------
    private final ProductRepository productRepository;


    //?----------------------------------------------   CONSTRUCTOR   --------------------------------------------------
    public ProductServiceImplements(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    //?----------------------------------------------   METHODS   ------------------------------------------------------
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return ((ProductRepository) productRepository).save(product);
    }

    @Override
    public List<Product> findAllById(Long id) {
        Optional<Product> optionalById = productRepository.findById(id);
        return (List<Product>) optionalById.get();
    }

    @Override
    public void deleteById(Long id) {
        try {
            productRepository.deleteById(id);
        } catch (Exception errDeleteByID) {
            throw new RuntimeException("⚠️⚠️ Product not found / Produto não encontrado ⚠️⚠️");
        }
        //return ((ProductRepository) productRepository).deleteById(id).orElseThrow(() -> new RuntimeException("⚠️⚠️ Product not found / Produto não encontrado ⚠️⚠️"));
    }
}
