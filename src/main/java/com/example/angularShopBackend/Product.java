package com.example.angularShopBackend;

import java.util.Arrays;
import java.util.List;

public record Product(String _id, String name, String description, String image, String category, Double price, Integer quantity) {

    private static final List<Product> categories = Arrays.asList(
            new Product(
                    "1",
                   "Tin of Cookies",
                    "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.",
                    "cookie-tin.jpg",
                    Category.getCategoryById("1")._id(),
                    2.99,
                    500
            ),
            new Product(
                    "2",
                    "Canned Coffee",
                    "Praesent sed lacinia mauris. Nulla congue nibh magna, at feugiat nunc scelerisque quis. Donec iaculis rutrum vulputate. Suspendisse lectus sem, vulputate ac lectus sed, placerat consequat dui.",
                    "canned-coffee.jpg",
                    Category.getCategoryById("1")._id(),
                    1.99,
                    500
            ),
            new Product(
                    "3",
                    "Toilet Paper",
                    "Donec volutpat erat erat, sit amet gravida justo sodales in. Phasellus tempus euismod urna. Proin ultrices nisi ut ipsum congue, vitae porttitor libero suscipit. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Aliquam lacinia a nisi non congue.",
                    "toilet-paper.jpg",
                    Category.getCategoryById("2")._id(),
                    7.99,
                    20
            ),
            new Product(
                    "4",
                    "Handmade Soap",
                    "Praesent placerat, odio vel euismod venenatis, lectus arcu laoreet felis, et fringilla sapien turpis vestibulum nisl.",
                    "soap.jpg",
                    Category.getCategoryById("2")._id(),
                    3.99,
                    50
            ),
            new Product(
                    "5",
                    "Set of Wooden Spoons",
                    "Vivamus ut turpis in purus pretium mollis. Donec turpis odio, semper vel interdum ut, vulputate at ex. Duis dignissim nisi vel tortor imperdiet finibus. Aenean aliquam sagittis rutrum.",
                    "wooden-spoons.jpg",
                    Category.getCategoryById("2")._id(),
                    14.99,
                    100
            ),
            new Product(
                    "6",
                    "Camera",
                    "Vestibulum risus metus, luctus non tortor quis, tincidunt consectetur ex. Nullam vitae lobortis ligula, ut sagittis massa. Curabitur consectetur, tellus at pulvinar venenatis, erat augue cursus erat, eu ullamcorper eros lectus ultrices ipsum. Integer rutrum, augue vitae auctor venenatis, turpis turpis elementum orci, at sagittis risus mi a leo.",
                    "camera.jpg",
                    Category.getCategoryById("3")._id(),
                    399.99,
                    30
            ),
            new Product(
                    "7",
                    "Tablet",
                    "In sodales, ipsum quis ultricies porttitor, tellus urna aliquam arcu, eget venenatis purus ligula ut nisi. Fusce ut felis dolor. Mauris justo ante, aliquet non tempus in, tempus ac lorem. Aliquam lacinia dolor eu sem eleifend ultrices. Etiam mattis metus metus. Sed ligula dui, placerat non turpis vitae, suscipit volutpat elit. Phasellus sagittis, diam elementum suscipit fringilla, libero mauris scelerisque ex, ac interdum diam erat non sapien.",
                    "tablet.jpg",
                    Category.getCategoryById("3")._id(),
                    199.99,
                    30
            ),
            new Product(
                    "8",
                    "Tales at Bedtime",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum ornare diam quis eleifend rutrum. Aliquam nulla est, volutpat non enim nec, pharetra gravida augue. Donec vitae dictum neque. Pellentesque arcu lorem, fringilla non ligula ac, tristique bibendum erat. Ut a semper nibh. Quisque a mi et mi tempor ultricies. Maecenas eu ipsum eu enim hendrerit accumsan at euismod urna.",
                    "bedtime-book.jpg",
                    Category.getCategoryById("4")._id(),
                    9.99,
                    100
            ),
            new Product(
                    "9",
                    "Spinning Top",
                    "Ut vulputate hendrerit nibh, a placerat elit cursus interdum.",
                    "spinning-top.jpg",
                    Category.getCategoryById("5")._id(),
                    1.99,
                    1000
            ),
            new Product (
                    "10",
                    "Set of Plastic Horses",
                    "Sed a mauris condimentum, elementum enim in, rhoncus dui. Phasellus lobortis leo odio, sit amet pharetra turpis porta quis.",
                    "plastic-horses.jpg",
                    Category.getCategoryById("5")._id(),
                    2.99,
                    1000
            ),
            new Product(
                    "11",
                    "Teddy Bear",
                "Vestibulum et erat finibus erat suscipit vulputate sed vitae dui. Ut laoreet tellus sit amet justo bibendum ultrices. Donec vitae felis vestibulum, congue augue eu, finibus turpis.",
                    "teddy-bear.jpg",
                    Category.getCategoryById("5")._id(),
                    7.99,
                    100
            ),
            new Product(
                    "12",
                    "Alphabet Blocks",
                    "Morbi consectetur viverra urna, eu fringilla turpis faucibus sit amet. Suspendisse potenti. Donec at dui ac sapien eleifend hendrerit vel sit amet lectus.",
                    "alphabet-blocks.jpg",
                    Category.getCategoryById("5")._id(),
                    9.99,
                    600
            )
    );
}
