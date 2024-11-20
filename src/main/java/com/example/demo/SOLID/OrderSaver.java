package com.example.demo.SOLID;

// OrderSaver interface - specific to saving orders.
public interface OrderSaver {
    void saveOrder(Order order);
}

// DatabaseOrderSaver - saves orders to a database.
 class DatabaseOrderSaver implements OrderSaver {
    @Override
    public void saveOrder(Order order) {
        System.out.println("Saving order " + order.getOrderId() + " to the database.");
        // Database saving logic
    }
}

// FileOrderSaver - saves orders to a file.
 class FileOrderSaver implements OrderSaver {
    @Override
    public void saveOrder(Order order) {
        System.out.println("Saving order " + order.getOrderId() + " to a file.");
        // File saving logic
    }
}

