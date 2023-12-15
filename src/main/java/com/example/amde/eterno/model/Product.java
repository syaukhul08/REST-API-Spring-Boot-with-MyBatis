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
    private String category;
    private int stock;
}

