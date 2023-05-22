package com.aws.backend.services;

import com.aws.backend.entities.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> findAll();           // -> Busca todos os produtos
    Product save(Product product);      // -> Salva um produto
    List<Product> findAllById(Long id); // -> Busca um produto pelo id
    void deleteById(Long id);           // -> Deleta um produto pelo id
}
