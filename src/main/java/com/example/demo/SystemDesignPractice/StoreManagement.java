package com.example.demo.SystemDesignPractice;

import java.util.ArrayList;
import java.util.List;

/*
   List of products -->
   Every Product has Id, category and price --->
   For every category there is discount running in the store --->
   suppose for furniture we have 5% off and for Toys we have 20% off now
   the user will provide you the id if id is available then you have to print
   the product name ,discount offered and original price and price after discount .
    */
public class StoreManagement {
    static List<Product> products = new ArrayList<>();
    static Product findProduct = null;

    public static void main(String[] args) {
        populateProduct();
        int[] arr = {9};
        for (int j : arr) {
            findProduct(j);
        }
    }

    public static void populateProduct() {
        products.add(new Product(1, "Chair", "Furniture", 5000));
        products.add(new Product(2, "Drum", "Toy", 15000));
        products.add(new Product(3, "Pan", "Utensils", 35000));
        products.add(new Product(4, "Table", "Furniture", 500));
        products.add(new Product(5, "Plane", "Toy", 56000));
    }

    static void findProduct(int id) {
        if (findProduct != null) {
            for (Product product1 : products) {
                if (product1.getId() == id) {
                    findProduct = product1;
                    break;
                }
            }
            discountOnProductParser(id);
        } else {
            System.out.println("Product with id : " + id + "not found");
        }
    }

    static void discountOnProductParser(int id) {
        String category = findProduct.getCategory();
        Double discount = 0.0;
        if (category.equalsIgnoreCase("Furniture")) {
            discount = 5.0;
        } else if (category.equalsIgnoreCase("Toy")) {
            discount = 20.0;

        } else if (category.equalsIgnoreCase("Utensils")) {
            discount = 25.0;

        }
        double originalPrice = findProduct.getPrice();
        double discountPercentage = (originalPrice * discount) / 100;
        double discountedPrice = originalPrice - discountPercentage;
        System.out.println("Product id : " + findProduct.getId());
        System.out.println("Product name" + ":" + findProduct.getName());
        System.out.println("Product category" + ":" + findProduct.getCategory());
        System.out.println("Product Original price" + ":" + originalPrice);
        System.out.println("Product Discounted price" + ":" + discountedPrice);
        System.out.println(" ");

    }
}

class Product {
    private int id;
    private String name;
    private String category;
    private int price;

    public Product(int id, String name, String category, int price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
