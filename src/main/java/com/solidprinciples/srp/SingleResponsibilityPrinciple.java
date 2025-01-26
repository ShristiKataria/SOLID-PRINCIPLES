package com.solidprinciples.srp;

/*
S in SOLID standards for Single Responsibility Principle (SRP)
 */
public class SingleResponsibilityPrinciple {

/*
A class should have only one reason to change.

This means that a class should only have one responsibility or purpose.
If a class has more than one responsibility,
it becomes harder to maintain, test,
and extend because changes to one responsibility might affect the other.

 */
    // without SRP

    public void calculateSalary() {
        // Salary calculation logic
    }

    public void generateReport() {
        // Report generation logic
    }
    /*
    Problems:

The Employee class has two responsibilities: salary calculation and report generation.
Any changes to the reporting logic might inadvertently affect the salary calculation logic.

     */
}
