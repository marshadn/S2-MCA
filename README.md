[DBMS](DBMS/README.md)

# Comprehensive Guide to OOP in Java, DBMS, and Shell Scripting

## Table of Contents
1. [Object-Oriented Programming in Java](#object-oriented-programming-in-java)
    - [Introduction to OOP](#introduction-to-oop)
    - [Key Concepts of OOP](#key-concepts-of-oop)
        - [Classes and Objects](#classes-and-objects)
        - [Inheritance](#inheritance)
        - [Polymorphism](#polymorphism)
        - [Encapsulation](#encapsulation)
        - [Abstraction](#abstraction)
    - [Java OOP Features](#java-oop-features)
    - [Examples of OOP in Java](#examples-of-oop-in-java)
2. [Database Management Systems (DBMS)](#database-management-systems-dbms)
    - [Introduction to DBMS](#introduction-to-dbms)
    - [Types of DBMS](#types-of-dbms)
        - [Hierarchical DBMS](#hierarchical-dbms)
        - [Network DBMS](#network-dbms)
        - [Relational DBMS](#relational-dbms)
        - [Object-Oriented DBMS](#object-oriented-dbms)
    - [Key Concepts of DBMS](#key-concepts-of-dbms)
        - [Schema](#schema)
        - [Tables](#tables)
        - [SQL](#sql)
        - [Normalization](#normalization)
    - [Advantages of DBMS](#advantages-of-dbms)
    - [Examples of DBMS](#examples-of-dbms)
        - [MySQL](#mysql)
        - [PostgreSQL](#postgresql)
        - [MongoDB](#mongodb)
3. [Shell Scripting](#shell-scripting)
    - [Introduction to Shell Scripting](#introduction-to-shell-scripting)
    - [Basic Concepts of Shell Scripting](#basic-concepts-of-shell-scripting)
        - [Shell Types](#shell-types)
        - [Syntax and Structure](#syntax-and-structure)
    - [Common Shell Commands](#common-shell-commands)
    - [Advanced Shell Scripting](#advanced-shell-scripting)
        - [Conditional Statements](#conditional-statements)
        - [Loops](#loops)
        - [Functions](#functions)
    - [Examples of Shell Scripts](#examples-of-shell-scripts)

---

## Object-Oriented Programming in Java

### Introduction to OOP

Object-Oriented Programming (OOP) is a programming paradigm that uses objects and classes to design and develop applications. OOP concepts in Java help to create modular, reusable, and scalable software. Java is known for its strong OOP capabilities, making it one of the most widely used programming languages.

### Key Concepts of OOP

#### Classes and Objects

- **Class**: A blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into a single unit.
- **Object**: An instance of a class. It is a real-world entity that contains states and behaviors defined by its class.

```java
public class Animal {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Buddy";
        dog.age = 5;
        dog.displayInfo();
    }
}
