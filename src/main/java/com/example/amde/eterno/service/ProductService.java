package com.example.amde.eterno.service;

import com.example.amde.eterno.mapper.ProductMapper;
import com.example.amde.eterno.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductMapper mapper;

    public List<Product> findAll() {
        return mapper.findAll();
    }

    public Product findById(int id) {
        return mapper.findById(id);
    }

    public Product findByName(String name) {
        return mapper.findByName(name);
    }
    public int deleteBydId(int id) {
        return mapper.deleteById(id);
    }

    public int save(Product item) {
        return mapper.save(item);
    }

    public int update(int id, Product item) {
        item.setId(id);
        return mapper.update(item);
    }
}
