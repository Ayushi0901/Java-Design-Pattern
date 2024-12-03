package com.example.demo.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        AnimalfactoryClass animalfactoryClass=new AnimalfactoryClass();

        Animal animals= animalfactoryClass.createAnimal("Goat");
        animals.animal();


        Animal animals2=animalfactoryClass.createAnimal("Pig");
        animals2.animal();
    }
}
