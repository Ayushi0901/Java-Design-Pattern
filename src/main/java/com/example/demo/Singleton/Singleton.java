package com.example.demo.Singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Singleton {
    private Singleton() {

    }

    private static Singleton uniqueDemoApp;

    public static Singleton getInstance() {
        if (uniqueDemoApp == null) {
            uniqueDemoApp = new Singleton();
        }
        return uniqueDemoApp;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
//        SpringApplication.run(DemoApplication.class, args);
        Singleton singleton = new Singleton();
        singleton.showMessage();
    }

}
