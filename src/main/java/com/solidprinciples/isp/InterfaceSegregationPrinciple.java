package com.solidprinciples.isp;
//ISP
public class InterfaceSegregationPrinciple {
/*

The I in the SOLID principles stands for the Interface Segregation Principle (ISP).

Definition:
A class should not be forced to implement interfaces it does not use.

This means that an interface should contain only the methods
that are relevant to the specific functionality it represents.
If an interface is too large and contains unrelated methods,
 it should be split into smaller, more specific interfaces.
 */

    /*
    Avoid Fat Interfaces:

Large interfaces with many unrelated methods are problematic because implementing
classes may need to provide unnecessary or meaningless implementations for methods they don’t use.

Promote Specificity:

Interfaces should be designed to meet the specific needs of the client (class) that implements them.
Enhances Flexibility:

By splitting large interfaces into smaller ones, you make the system more flexible and easier to maintain.
     */
}
