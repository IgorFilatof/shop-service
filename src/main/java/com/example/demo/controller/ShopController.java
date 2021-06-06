package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductDAO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopController {

    private final ProductDAO productDAO;

    public ShopController(ProductDAO productDAO) {
        this.productDAO = productDAO;
    }

    @GetMapping(value = "/allProducts")
    public List<Product> getAllProducts() {
        Product product=new Product();
        product.setProductName("Book");
        productDAO.save(product);
        return productDAO.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,consumes = "application/json",
    produces="application/json")
    public Product addProduct(@RequestBody Product product) {
        Product save = productDAO.save(product);
        return save;
    }

}
