package com.example.demo.SystemDesignPractice;

import java.util.ArrayList;
import java.util.List;

public class DiscountManagement {

    static List<Product> productList = new ArrayList<>();

    static void populateProduct() {
        productList.add(new Product("Mobile", "Phones", 50000, 1));
        productList.add(new Product("Sofa", "Furniture", 20000, 2));
        productList.add(new Product("Stove", "Kitchen", 10000, 3));
        productList.add(new Product("Cars", "Toys", 600000, 4));

    }

   static class Product {
        private String product;
        private String category;
        private int price;
        private int id;


        public Product(String product, String category, int price, int id) {
            this.category = category;
            this.product = product;
            this.id = id;
            this.price = price;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getProduct() {
            return product;
        }

        public void setProduct(String product) {
            this.product = product;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }}

    static class Discount {
        public void getDiscountOnCategory(int id) {
            populateProduct();
            boolean productNotAvailable = false;
            double discountedPrice = 0.0;

            for (Product product : productList) {
                if (product.getId() == id) {
                    if (product.getCategory().equals("Phones")) {
                        productNotAvailable = true;
                        discountedPrice += 0.05 * product.getPrice();
                        System.out.println("price before discount" + product.getPrice());
                        System.out.println("price after discount" + discountedPrice + " on product " + product.getProduct());
                    } else if (product.getCategory().equals("Furniture")) {
                        productNotAvailable = true;
                        discountedPrice += 0.10 * product.getPrice();
                        System.out.println("price before discount" + product.getPrice());
                        System.out.println("price after discount" + discountedPrice + " on product " + product.getProduct());
                    } else if (product.getCategory().equals("Kitchen")) {
                        productNotAvailable = true;
                        discountedPrice += 0.50 * product.getPrice();
                        System.out.println("price before discount" + product.getPrice());
                        System.out.println("price after discount" + discountedPrice + " on product " + product.getProduct());
                    } else if (product.getCategory().equals("Toys")) {
                        productNotAvailable = true;
                        discountedPrice += 0.20 * product.getPrice();
                        System.out.println("price before discount" + product.getPrice());
                        System.out.println("price after discount" + discountedPrice + " on product " + product.getProduct());
                    }
                }


            }
            if (!productNotAvailable) {
                System.out.println("Product not found");
            }

        }
    }

    public static void main(String[] args) {
        Discount discountManagement = new Discount();
        int id = 7;
        discountManagement.getDiscountOnCategory(id);

    }
}
