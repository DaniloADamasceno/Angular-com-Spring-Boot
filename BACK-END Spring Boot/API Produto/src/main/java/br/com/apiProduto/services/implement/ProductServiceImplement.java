package br.com.apiProduto.services.implement;

import br.com.apiProduto.entities.Product;
import br.com.apiProduto.repository.ProductRepository;
import br.com.apiProduto.services.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

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
