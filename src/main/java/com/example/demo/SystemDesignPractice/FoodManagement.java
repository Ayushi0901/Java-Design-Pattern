package com.example.demo.SystemDesignPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/*
Design a Food Delivery Application with the following features:

Add Restaurants → Add restaurants with a unique name and menu (dishes with name and price).
View Menu → View the menu of a specific restaurant or show an error if it doesn’t exist.
Place Orders → Order by restaurant and dish name, showing total price or an error if not found.
Search Dishes → Find a dish across restaurants, listing where it's available with prices or an error if unavailable.
List Restaurants → Display all available
 */
class Menu {
    private String dishesName;
    private Double dishesPrice;

    public Menu(String dishesName, Double dishesPrice) {
        this.dishesName = dishesName;
        this.dishesPrice = dishesPrice;
    }

    public Double getDishesPrice() {
        return dishesPrice;
    }

    public void setDishesPrice(Double dishesPrice) {
        this.dishesPrice = dishesPrice;
    }

    public String getDishesName() {
        return dishesName;
    }

    public void setDishesName(String dishesName) {
        this.dishesName = dishesName;
    }


}

class Restaurant {
    private String restName;
    private List<Menu> menus;

    public Restaurant(String restName, List<Menu> menus) {
        this.restName = restName;
        this.menus = menus;
    }

    public String getRestName() {
        return restName;
    }

    public void setRestName(String restName) {
        this.restName = restName;
    }

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }
}

public class FoodManagement {
    List<Restaurant> restaurantList = new ArrayList<>();

    public void addRestaurant(String restName, List<Menu> menus) {
        restaurantList.add(new Restaurant(restName, menus));
    }

    public void viewMenu(String restaurantName) {
        boolean restNotValid = false;
        for (Restaurant restaurant : restaurantList) {
            String restaurantNames = restaurant.getRestName();
            if (restaurantName.equals(restaurantNames)) {
                restNotValid = true;
                List<Menu> menuList = restaurant.getMenus();
                for (Menu menus : menuList) {
                    System.out.println("Restaurant found! with menu" + menus.getDishesName() + menus.getDishesPrice());
                }
            }
        }
        if (!restNotValid) {
            System.out.println("Restaurant not found");
        }
    }

    public void placeOrder(String restName, String dishName) {
        boolean isValidRest = false;
        boolean isValidDish = false;
        for (Restaurant restaurant : restaurantList) {
            String restaurantName = restaurant.getRestName();

            if (Objects.equals(restaurantName, restName)) {
                isValidRest = true;
                List<Menu> restMenu = restaurant.getMenus();
                for (Menu menu : restMenu) {
                    isValidDish = true;
                    if (Objects.equals(menu.getDishesName(), dishName)) {
                        System.out.println(" Order Places " + dishName + " from " + restName);
                    }

                }
            }

        }
        if (!isValidDish) {
            System.out.println("Dish not available");
        }
        if (!isValidRest) {
            System.out.println("restaurant not found");
        }

    }

    public void searchDishes(String dishName) {
        boolean isNotFoundDish = false;
        for (Restaurant restaurant : restaurantList) {
            List<Menu> menuList = restaurant.getMenus();
            for (Menu menu : menuList) {

                if (Objects.equals(menu.getDishesName(), dishName)) {
                    isNotFoundDish = true;
                    System.out.println("Dish Available " + dishName + " in " + restaurant.getRestName());
                }
            }
        }
        if (!isNotFoundDish) {
            System.out.println("dish is not avaiable");
        }

    }

    public void listResturant() {
        for (Restaurant restaurant : restaurantList) {
            System.out.println(restaurant.getRestName());
        }

    }


    public static void main(String[] args) {
        FoodManagement app = new FoodManagement();

        // Add restaurants and menus
        app.addRestaurant("Pizza Palace", Arrays.asList(new Menu("Margherita", 8.5), new Menu("Pepperoni", 10.0), new Menu("Veggie Delight", 9.0)));

        app.addRestaurant("Burger Barn", Arrays.asList(new Menu("Cheeseburger", 6.0), new Menu("Veggie Burger", 5.5), new Menu("Chicken Burger", 7.0)));
        app.listResturant();    // pizza palace burger barn


        // View menu for a specific restaurant
        app.viewMenu("Pizza Palace"); //Margherita", 8.5),
        //"Pepperoni", 10.0
        //"Veggie Delight, 11

        // Place an order
        app.placeOrder("Pizza Palace", "Margherita"); //" Order Places " + Margherita + " from " + Pizza Palace

        // Search for a dish
        app.searchDishes("Veggie Burger"); // "Dish Available " + Veggie Burger + " in " + Burger Barn
    }
}
