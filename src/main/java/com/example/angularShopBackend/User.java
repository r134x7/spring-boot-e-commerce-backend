package com.example.angularShopBackend;

import java.util.List;

public record User(String _id, String firstName, String lastName, String email, List<Order> orders) {
}
