package com.example.e_commerce_back;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @CrossOrigin(origins = "http://localhost:9000")
    @GetMapping("/allProducts")
    Product[] allProducts() {

        Product[] products = new Product[4];

        products[0] = new Product(1, 10, "World's Best Boss Mug", "Kitchen", "/img/cup.webp");
        products[1] = new Product(2, 20, "Bedroom Table", "Bedroom", "/img/table.webp");
        products[2] = new Product(3, 30, "Fridge", "Kitchen", "/img/fridge.jpeg");
        products[3] = new Product(4, 40, "Kitchen Table", "Kitchen", "/img/table.webp");

        return products;
    }
}
