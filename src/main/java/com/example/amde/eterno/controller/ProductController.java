package com.example.amde.eterno.controller;

import com.example.amde.eterno.model.Product;
import com.example.amde.eterno.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data_product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public List<Product> findAll(){
        return service.findAll();
    }

    @GetMapping("/findId")
    public Product findById(@RequestParam("id") int id){
        return service.findById(id);
    }

    @GetMapping("/findName")
    public Product findByName(@RequestParam("name") String name){
        return service.findByName(name);
    }

    @PostMapping("/addProduct")
    public int save(@RequestBody Product product){
        return service.save(product);
    }

    @PutMapping("/updateProduct")
    public int update(@RequestParam("id")int id, @RequestBody Product product){
        return service.update(id, product);
    }

    @DeleteMapping("/deleteProduct")
    public int deleteById(@RequestParam("id") int id){
        return service.deleteBydId(id);
    }

}

