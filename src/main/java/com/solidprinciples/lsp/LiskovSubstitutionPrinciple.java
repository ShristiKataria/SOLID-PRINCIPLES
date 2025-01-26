package com.solidprinciples.lsp;

/*
The L in the SOLID principles stands for the Liskov Substitution Principle (LSP).
*/
public class LiskovSubstitutionPrinciple {
/*
 * It sates that an object of a child must be able to replace an object of the parent
   class without breaking the application
 * All the base class methods must be applicable for the derived class method.
 */

/*
Steps:
a) Create interface
b) add common methods in the interface
c) create separate interfaces for different functionalities
 */


/*
Behavioral Consistency:

Subclasses must behave in a way that is consistent with the expectations set by the superclass.
No Overriding Core Functionality:

Subclasses should not override or weaken the functionality of the
superclass in a way that violates its contract.
Contracts and Invariants:

Subclasses must honor the invariants and contracts of the superclass.
Avoid Violations:

A violation occurs when a subclass changes behavior in a way that
causes the program to fail when the subclass is used in place of the superclass.

 */
}
