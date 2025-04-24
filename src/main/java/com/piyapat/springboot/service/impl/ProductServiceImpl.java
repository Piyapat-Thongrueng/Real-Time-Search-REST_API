package com.piyapat.springboot.service.impl;

import com.piyapat.springboot.entity.Product;
import com.piyapat.springboot.repository.ProductRepository;
import com.piyapat.springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> searchProducts(String query) {

        List<Product> products = productRepository.searchProducts(query);
        return products;

    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}
