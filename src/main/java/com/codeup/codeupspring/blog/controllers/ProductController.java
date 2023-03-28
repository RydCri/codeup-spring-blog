package com.codeup.codeupspring.blog.controllers;

import com.codeup.codeupspring.blog.models.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.codeup.codeupspring.blog.repositories.ProductRepository;

import java.util.List;

@Controller
public class ProductController {
    //Dependancy Injection
    private ProductRepository productsDao;

    public ProductController(ProductRepository productsDao) {
        this.productsDao = productsDao;
    }

    @GetMapping("/products")
    public String getProductIndex(Model model) {
        List<Product> products =
        model.addAttribute("products",products);
    return "products/products-index";
    }
}
