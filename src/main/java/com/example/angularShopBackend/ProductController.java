package com.example.angularShopBackend;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ProductController {

    @QueryMapping
    public Product product(String _id) {
        return Product.getProduct(_id);
    }
}
