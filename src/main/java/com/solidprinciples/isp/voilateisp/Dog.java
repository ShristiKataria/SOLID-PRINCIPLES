package com.solidprinciples.isp.voilateisp;

public class Dog
        implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Dogs can't fly!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming.");
    }
}
/*
Why It Violates ISP:

The Dog class is forced to implement the fly() method, even though it doesn’t make sense for dogs to fly.
This results in unnecessary or incorrect implementations.
 */
