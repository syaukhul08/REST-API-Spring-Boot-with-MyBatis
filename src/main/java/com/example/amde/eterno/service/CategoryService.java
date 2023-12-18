package com.example.amde.eterno.service;

import com.example.amde.eterno.mapper.CategoryMapper;
import com.example.amde.eterno.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper mapper;

    public List<Category> findAll() {
        return mapper.findAll();
    }

    public Category findById(int id) {
        return mapper.findById(id);
    }

    public Category findByName(String name) {
        return mapper.findByName(name);
    }
    public int deleteBydId(int id) {
        return mapper.deleteById(id);
    }

    public int save(Category item) {
        return mapper.save(item);
    }

    public int update(int id, Category item) {
        item.setId(id);
        return mapper.update(item);
    }
}
