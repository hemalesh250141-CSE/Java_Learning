class Animal { 
    void sound() { 
        System.out.println("Animal makes a sound"); 
    } 
} 
 
class Dog extends Animal { 
    @Override 
    void sound() { 
        System.out.println("Dog barks"); 
    } 
} 
 
class Cat extends Animal { 
    @Override 
    void sound() { 
        System.out.println("Cat meows"); 
} 
} 
public class Main { 
public static void main(String[] args) { 
Animal a;           // reference of superclass 
a = new Dog(); 
a.sound();          // Dog's version 
a = new Cat(); 
a.sound();          // Cat's version 
} 
} 
