package com.codeup.codeupspring.blog.repositories;

import com.codeup.codeupspring.blog.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {

}
