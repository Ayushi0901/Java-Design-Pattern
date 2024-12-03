package com.example.demo.Singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Singleton {
    private Singleton() {

    }

    private static volatile Singleton singleton;

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public void showMsg() {
        System.out.println("this is singleton thread class");
    }

    public static void main(String[] args) {
        Singleton singleton1 = new Singleton();
        singleton1.showMsg();
    }
}
