package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String productName;
}
