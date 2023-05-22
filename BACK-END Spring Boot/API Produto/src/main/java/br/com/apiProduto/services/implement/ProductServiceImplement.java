package br.com.apiProduto.services.implement;

import br.com.apiProduto.entities.Product;
import br.com.apiProduto.repository.ProductRepository;
import br.com.apiProduto.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements ProductService {

    //?----------------------------------------------   INJECTIONS DEPENDENCY   ----------------------------------------
    private final ProductRepository productRepository;


    //?----------------------------------------------   CONSTRUCTOR   --------------------------------------------------
    public ProductServiceImplement(ProductRepository productRepository) {
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

//    FIND ALL BY ID
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
