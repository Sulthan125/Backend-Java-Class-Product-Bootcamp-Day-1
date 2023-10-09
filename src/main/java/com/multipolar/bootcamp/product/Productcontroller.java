package com.multipolar.bootcamp.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Productcontroller {
    @GetMapping("/product")
    public ResponseEntity<List<Product>> todos(){
        List<Product> productList = List.of(
                new Product(1,"Donat"),
                new Product(2,"Ayam"),
                new Product(3,"Kentang")
        );
        return ResponseEntity.ok(productList);
    }
}
