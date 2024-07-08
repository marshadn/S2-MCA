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
```


## Inheritance

Inheritance in Java allows a class (subclass or child class) to inherit properties and behaviors from another class (superclass or parent class). This promotes code reusability and establishes an "is-a" relationship between classes.

## Polymorphism

Polymorphism allows objects to be treated as instances of their parent class rather than their specific class type. In Java, polymorphism is achieved through method overriding (where a subclass provides a specific implementation of a method defined in its superclass) and method overloading (where multiple methods in the same class have the same name but different parameters).

## Encapsulation

Encapsulation is the bundling of data (attributes) and methods (functions) that operate on the data into a single unit (class). It involves hiding the internal state of an object and restricting access to certain components using access modifiers (like private, protected, public).

## Abstraction

Abstraction in Java involves hiding the complex implementation details and showing only the essential features of an object. It allows developers to focus on what an object does rather than how it does it. Abstract classes and interfaces are used to achieve abstraction in Java.

## Java OOP Features

Java is designed with several features to support Object-Oriented Programming:

- **Class**: Defines the blueprint for objects by specifying data (attributes) and methods (functions).
- **Object**: Instances of classes that contain the actual data.
- **Inheritance**: Allows a new class to inherit properties and methods from an existing class.
- **Polymorphism**: Enables objects to be treated as instances of their parent class.
- **Encapsulation**: Bundles data and methods within a class and controls access using access modifiers.
- **Abstraction**: Hides the complex implementation details and shows only the necessary functionalities.

## Examples of OOP in Java

### Example 1: Inheritance and Method Overriding

This example demonstrates how inheritance allows a subclass to override methods from its superclass to provide specific implementations.

### Example 2: Encapsulation and Access Modifiers

This example showcases how encapsulation in Java helps in bundling data and methods within a class and controlling access to them using access modifiers.



# Database Management Systems (DBMS)

## Introduction to DBMS

A Database Management System (DBMS) is software that interacts with end users, applications, and the database itself to capture and analyze data. A DBMS allows for the definition, creation, querying, update, and administration of databases.

## Types of DBMS

There are several types of DBMS, each suited to different types of data and applications:

### Hierarchical DBMS

Hierarchical DBMS organizes data in a tree-like structure. The data is stored as a collection of field values where each field contains only one value.

### Network DBMS

Network DBMS uses a network structure to create relationships between entities. It allows multiple relationships between different types of data.

### Relational DBMS

Relational DBMS (RDBMS) stores data in tabular form. It uses Structured Query Language (SQL) for database access and manipulation.

### Object-Oriented DBMS

Object-Oriented DBMS (OODBMS) stores data in objects, similar to Object-Oriented Programming (OOP). It supports complex data types and inheritance.

## Key Concepts of DBMS

### Schema

A schema is the structure that defines the organization of data in a database. It includes the tables, columns, and relationships between them.

### Tables

Tables are the basic storage units in a database. Each table consists of rows (records) and columns (fields).

### SQL

Structured Query Language (SQL) is the standard language for querying and manipulating databases.

### Normalization

Normalization is the process of organizing data to minimize redundancy and improve data integrity. It involves dividing large tables into smaller, related tables.

## Advantages of DBMS

- **Data Integrity**: Ensures data accuracy and consistency.
- **Data Security**: Provides mechanisms to control access to data.
- **Data Administration**: Facilitates data management and administration.
- **Concurrent Access**: Allows multiple users to access data simultaneously.
- **Data Independence**: Separates the data from the applications that use the data.

## Examples of DBMS

### MySQL

MySQL is an open-source relational database management system known for its reliability, performance, and ease of use.

### PostgreSQL

PostgreSQL is an advanced open-source relational database known for its extensibility and standards compliance.

### MongoDB

MongoDB is a NoSQL database known for its flexibility and scalability. It stores data in JSON-like documents.

