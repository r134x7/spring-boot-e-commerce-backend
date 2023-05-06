package com.example.angularShopBackend;

import java.util.Arrays;
import java.util.List;

public record Category(String _id, String name) {

    private static final List<Category> categories = Arrays.asList(
            new Category("1", "Food"),
            new Category("2", "Household Supplies"),
            new Category("3", "Electronics"),
            new Category("4", "Books"),
            new Category("5", "Toys")
    );

    public static List<Category> getCategories () {
        return categories;
    }

    public static Category getCategoryById(String id) {
        return categories.stream().filter(elem -> elem._id().equals(id)).findFirst().orElse(null);
    }
}
