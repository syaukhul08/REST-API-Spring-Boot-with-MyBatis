package com.example.amde.eterno.controller;

import com.example.amde.eterno.model.Product;
import com.example.amde.eterno.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/data_product")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> products = service.findAll();
        if (!products.isEmpty()) {
            return new ResponseEntity<>(products, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/findId")
    public ResponseEntity<Product> findById(@RequestParam("id") int id) {
        Product product = service.findById(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
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

