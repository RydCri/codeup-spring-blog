package com.codeup.codeupspring.blog.controllers;

import models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ProductController {
    @GetMapping("/products")
    public String getProductIndex(Model model) {
        List<Product> products = new ArrayList<>(Arrays.asList(
                new Product(1L, "Xbox", 22000),
                new Product(2L, "3D0", 20),
                new Product(2, "CDI", 500)
        ));
        model.addAttribute("products",products);
    return "products/products-index";
    }
}
