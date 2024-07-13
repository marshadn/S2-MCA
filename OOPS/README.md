# Object-Oriented Programming (OOP) Concepts in Java

This repository contains detailed explanations and examples of Object-Oriented Programming (OOP) concepts in Java. The aim is to help understand the core principles and how they are implemented in Java.

## Table of Contents
- [Introduction](#introduction)
- [Classes and Objects](#classes-and-objects)
- [Inheritance](#inheritance)
- [Polymorphism](#polymorphism)
- [Abstraction](#abstraction)
- [Encapsulation](#encapsulation)


## Introduction
Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code that manipulates that data. The key principles of OOP are:

1. **Classes and Objects**
2. **Inheritance**
3. **Polymorphism**
4. **Abstraction**
5. **Encapsulation**

## Classes and Objects
### Classes
A class is a blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into one single unit.

```java
public class Car {
    // Fields
    String color;
    String model;
    int year;

    // Constructor
    public Car(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}
```
### Objects
An object is an instance of a class. When a class is defined, no memory is allocated until an object of that class is created.

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Red", "Toyota", 2020);
        myCar.displayInfo();
    }
}
```
### Inheritance
Inheritance is a mechanism where one class acquires the properties and behaviors of a parent class.
```java
// Parent class
public class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class
public class Dog extends Animal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat(); // Inherited method
        myDog.bark(); // Child class method
    }
}
```
### Polymorphism
Polymorphism means "many shapes", and it allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation.

### Method Overloading
Method Overloading allows a class to have more than one method having the same name, if their parameter lists are different.
```java
public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
```
### Method Overriding
Method Overriding allows a subclass to provide a specific implementation of a method that is already defined in its superclass.
```java
public class Animal {
    public void makeSound() {
        System.out.println("This animal makes a sound.");
    }
}

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
```
### Abstraction
Abstraction is the concept of hiding the internal details and describing things in simple terms. It can be achieved with abstract classes and interfaces.<br>
<h3>Abstract Class</h3>

```java
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();
    
    // Regular method
    public void sleep() {
        System.out.println("This animal sleeps.");
    }
}

class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}
```
<h3>Interface</h3>

```java
interface Animal {
    public void eat();
    public void makeSound();
}

class Bird implements Animal {
    public void eat() {
        System.out.println("The bird eats seeds.");
    }

    public void makeSound() {
        System.out.println("The bird sings.");
    }
}
```
### Encapsulation
Encapsulation is the technique of making the fields in a class private and providing access to the fields via public methods.
```java
public class Person {
    // Private fields
    private String name;
    private int age;

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}
```
Happy Coding!
