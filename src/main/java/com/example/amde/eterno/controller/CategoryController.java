package com.example.amde.eterno.controller;

import com.example.amde.eterno.model.Category;
import com.example.amde.eterno.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data_category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping
    public List<Category> findAll() {
        return categoryService.findAll();
    }

    @GetMapping("/findId")
    public Category findById(@RequestParam("id") int id) {
        return categoryService.findById(id);
    }

    @GetMapping("/findName")
    public Category findByName(@RequestParam("name") String name) {
        return categoryService.findByName(name);
    }

    @PostMapping("/addCategory")
    public int save(@RequestBody Category category) {
        return categoryService.save(category);
    }

    @PutMapping("/updateCategory")
    public int update(@RequestParam("id") int id, @RequestBody Category category) {
        return categoryService.update(id, category);
    }

    @DeleteMapping("/deleteCategory")
    public int deleteById(@RequestParam("id") int id) {
        return categoryService.deleteBydId(id);
    }
}


