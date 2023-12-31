package com.example.amde.eterno.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {

    private int id;
    private String name;
    private int categoryId;
    private int stock;
    private Category category;
}

