package com.gla.Inheritance.Examples;

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Singlelevelinheritance {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();   // method from Animal class
        d.bark();  // method from Dog class
    }
}