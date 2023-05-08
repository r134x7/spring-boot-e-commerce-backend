package com.example.angularShopBackend;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @QueryMapping
    public Product product(String _id) {
        return Product.getProduct(_id);
    }

    @QueryMapping
    public List<Product> products() {
        return Product.getProducts();
    }
}
