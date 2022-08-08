package oop.abstraction;

/**
* Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).
The abstract keyword is a non-access modifier, used for classes and methods:
Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
 Why And When To Use Abstract Classes and Methods?
 To achieve security - hide certain details and only show the important details of an object.
 * */
abstract class Animal {
    public abstract void eat();
    public void sleep(){
        System.out.println("Sleeping...");
    }

    public static void main(String[] args) {
        //Animal animal = new Animal();  // it is not possible to create an object of the Animal class
    }
}
