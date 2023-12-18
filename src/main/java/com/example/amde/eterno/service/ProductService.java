package com.example.amde.eterno.service;

import com.example.amde.eterno.mapper.CategoryMapper;
import com.example.amde.eterno.mapper.ProductMapper;
import com.example.amde.eterno.model.Category;
import com.example.amde.eterno.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private CategoryService categoryService;

    public List<Product> findAll() {

        List<Product> products = productMapper.findAll();
        for (Product product : products) {
            Category category = categoryService.findById(product.getCategoryId());
            product.setCategory(category);
        }
        return products;
    }

    public Product findById(int id) {
        Product product = productMapper.findById(id);
        if (product != null) {
            Category category = categoryService.findById(product.getCategoryId());
            product.setCategory(category);
        }
        return product;
    }

    public Product findByName(String name) {
        return productMapper.findByName(name);
    }
    public int deleteBydId(int id) {
        return productMapper.deleteById(id);
    }

    public int save(Product item) {
        return productMapper.save(item);
    }

    public int update(int id, Product item) {
        item.setId(id);
        return productMapper.update(item);
    }
}
