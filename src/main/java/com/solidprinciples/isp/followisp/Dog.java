package com.solidprinciples.isp.followisp;

public class Dog implements Eater, Swimmer {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming.");
    }
/*
Now, only animals that can fly need to implement the Flyer interface:
Benefits of ISP:
Improves Maintainability:
Changes to one interface won’t affect unrelated classes.
Enhances Flexibility:
Classes implement only the interfaces they need.
Encourages Proper Design:
Smaller, focused interfaces make the system easier to understand and use.
By adhering to the Interface Segregation Principle, you avoid unnecessary
dependencies and ensure that your code is clean, modular, and easy to extend.
 */
}
