package com.company;


public class Runner {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");
        LoudDog loudDog = new LoudDog("Loud Dog");

        System.out.println(cat.speak()); // → "meow"
        System.out.println(dog.speak()); // → "wan"
        System.out.println(loudDog.speak()); // → "wan wan"
        new Kennel(cat, dog, loudDog).allSpeak();
    }
}