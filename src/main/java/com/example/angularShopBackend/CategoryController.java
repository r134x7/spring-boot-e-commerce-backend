package com.example.angularShopBackend;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CategoryController {

    @QueryMapping
    public List<Category> categories() {
        return Category.getCategories();
    }

}
