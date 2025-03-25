package com.example.demo.SystemDesignPractice;

import java.util.ArrayList;
import java.util.List;

/*
build a system to manage the inventory of an online store →
Every product will have an ID, name, category, price, and stock quantity →
The system should include these features:
Add Products → Add new items to the inventory with their details.
Update Stock → Change the stock quantity for an existing product.
Find Products → Retrieve details of a product using its ID.
Low Stock Alerts → Notify when the stock of a product falls below a certain limit.
 */
class Products {
    private int id;
    private String name;
    private String category;
    private double price;
    private int stockQuantity;

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public Products(int id, String name, String category, double price, int stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }
}

public class OnlineStoreManagement {

    List<Products> products = new ArrayList<>();

    public void addProduct(int id, String name, String category,
                           double price,
                           int stockQuantity) {
        products.add(new Products(id, name, category, price, stockQuantity));
        System.out.println("Product added " + id);
        System.out.println("Product name " + name);


    }

    public void updateProduct(int productId, int newQuantity) {
        for (Products product : products) {
            if (product.getId() == productId) {
                product.setStockQuantity(newQuantity);
                System.out.println("Stock Updated-> " + product.getName());
            }
        }
    }

    public void findProduct(int productId) {
        for (Products product : products) {
            if (product.getId() == productId) {
                System.out.println(product.getName());
            }
        }
        System.out.println("Product not found");
    }

    public void lowStockAlertsCheck(int threshold) {
        for (Products product : products) {
            if (product.getStockQuantity() < threshold) {
                System.out.println("Product " + product.getName() + " is falling below");
            } else {
                System.out.println("Product " + product.getName() + " is falling up");
            }
        }

    }

    public static void main(String[] args) {
        OnlineStoreManagement inventory = new OnlineStoreManagement();
        inventory.addProduct(1, "Table", "Furniture", 5000, 10);
        inventory.addProduct(2, "Chair", "Furniture", 2000, 2);
//        inventory.updateProduct(2, 5);
        inventory.findProduct(0);
        inventory.lowStockAlertsCheck(3);
    }
}
