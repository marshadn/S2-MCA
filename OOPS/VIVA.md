# Top 30 OOP-Related Questions in Java

## 1. What is Object-Oriented Programming (OOP)?
**Answer:** Object-Oriented Programming (OOP) is a programming paradigm that uses objects and classes to design and implement programs. It focuses on using objects to represent real-world entities and their interactions.

## 2. What are the main principles of OOP?
**Answer:** The main principles of OOP are:
- **Encapsulation:** Bundling data and methods that operate on the data within a single unit (class) and restricting access to some components.
- **Abstraction:** Hiding the complex implementation details and showing only the necessary features of an object.
- **Inheritance:** Creating new classes from existing ones, inheriting fields and methods.
- **Polymorphism:** The ability of different objects to be accessed through the same interface, enabling one interface to be used for a general class of actions.

## 3. What is a class in Java?
**Answer:** A class in Java is a blueprint for creating objects. It defines a datatype by bundling data and methods that work on the data into a single unit.

## 4. What is an object in Java?
**Answer:** An object is an instance of a class. It contains state (fields/attributes) and behavior (methods/functions) defined by the class.

## 5. What is encapsulation?
**Answer:** Encapsulation is the principle of wrapping data (variables) and code (methods) together as a single unit. It restricts direct access to some of the object's components, which can help prevent accidental interference and misuse of the data.

## 6. How does Java achieve encapsulation?
**Answer:** Java achieves encapsulation through access modifiers (private, protected, public) and by providing public getter and setter methods to access and update the private fields.

## 7. What is inheritance?
**Answer:** Inheritance is a mechanism in Java where one class (child/subclass) inherits the fields and methods of another class (parent/superclass). It promotes code reuse and establishes a natural hierarchy between classes.

## 8. What is the difference between class inheritance and interface implementation?
**Answer:** Class inheritance (extends keyword) allows a class to inherit the properties and methods of another class. Interface implementation (implements keyword) allows a class to implement the abstract methods defined in an interface, enabling multiple inheritance of method signatures.

## 9. What is polymorphism in Java?
**Answer:** Polymorphism allows objects of different classes to be treated as objects of a common superclass. It comes in two forms: compile-time (method overloading) and runtime (method overriding).

## 10. What is method overloading?
**Answer:** Method overloading is a feature that allows a class to have more than one method with the same name but different parameters (different type, number, or both). It is a compile-time polymorphism.

## 11. What is method overriding?
**Answer:** Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass. The overridden method in the subclass should have the same name, return type, and parameters as the method in the parent class. It is a runtime polymorphism.

## 12. What is an abstract class?
**Answer:** An abstract class is a class that cannot be instantiated on its own and is meant to be subclassed. It can have both abstract methods (without implementation) and concrete methods (with implementation).

## 13. What is an interface?
**Answer:** An interface in Java is a reference type, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. They are implemented by classes or extended by other interfaces.

## 14. What is the difference between an abstract class and an interface?
**Answer:** 
- Abstract classes can have instance fields, constructors, and methods with implementations. Interfaces can only have static final fields and method signatures (before Java 8). 
- A class can extend only one abstract class but can implement multiple interfaces.

## 15. What is the `this` keyword in Java?
**Answer:** The `this` keyword refers to the current instance of the class. It is used to resolve name conflicts, to call constructors, and to pass the current instance as an argument.

## 16. What is the `super` keyword in Java?
**Answer:** The `super` keyword refers to the immediate parent class of the current object. It is used to access the parent class's fields, methods, and constructors.

## 17. What is a constructor in Java?
**Answer:** A constructor is a special method that is called when an object is instantiated. It initializes the object and can have parameters to set initial values for fields. Constructors do not have a return type.

## 18. What is a default constructor?
**Answer:** A default constructor is a no-argument constructor that is automatically provided by Java if no other constructors are defined in the class. It initializes the object with default values.

## 19. Can constructors be overloaded?
**Answer:** Yes, constructors can be overloaded by defining multiple constructors with different parameter lists within the same class.

## 20. What is the difference between a constructor and a method?
**Answer:** A constructor is used to initialize an object and has no return type, whereas a method performs a specific action and has a return type. Constructors are called only once when an object is created, while methods can be called multiple times.

## 21. What is the purpose of a static method?
**Answer:** A static method belongs to the class rather than any specific instance of the class. It can be called without creating an instance of the class and can access static fields and other static methods directly.

## 22. What are static fields?
**Answer:** Static fields (also known as class variables) belong to the class rather than any specific instance of the class. All instances of the class share the same static fields.

## 23. What is the Singleton pattern?
**Answer:** The Singleton pattern ensures that a class has only one instance and provides a global point of access to it. This is typically achieved by making the constructor private and providing a static method to get the single instance.

## 24. What is the `final` keyword in Java?
**Answer:** The `final` keyword can be used with classes, methods, and variables to restrict their usage:
- **Final class:** Cannot be subclassed.
- **Final method:** Cannot be overridden.
- **Final variable:** Cannot be reassigned once initialized.

## 25. What is an inner class?
**Answer:** An inner class is a class defined within another class. It can be used to logically group classes that are only used in one place, increase encapsulation, and lead to more readable and maintainable code.

## 26. What is an anonymous inner class?
**Answer:** An anonymous inner class is a type of inner class without a name and is used to instantiate objects with certain modifications on the fly. It is often used when implementing interfaces or extending classes with only a few methods.

## 27. What is the difference between an inner class and a static nested class?
**Answer:** An inner class is associated with an instance of the enclosing class and can access its members, whereas a static nested class is associated with the class itself and cannot access non-static members of the enclosing class.

## 28. What is composition?
**Answer:** Composition is a design principle where one class contains a reference to another class (has-a relationship). It is used to build complex types by combining objects, promoting code reuse.

## 29. What is aggregation?
**Answer:** Aggregation is a specialized form of composition where the contained object can exist independently of the container object. It represents a weak ownership relationship (part-of).

## 30. What is the difference between aggregation and composition?
**Answer:** In composition, the contained object cannot exist independently of the container object (strong ownership). In aggregation, the contained object can exist independently of the container object (weak ownership).

