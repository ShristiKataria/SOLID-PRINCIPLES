package com.solidprinciples.ocp.afterocp;

import com.solidprinciples.ocp.afterocp.Discount;

public class VIPCustomerDiscount  implements Discount {
    public double calculateDiscount(double amount) {
        return amount * 0.3;
    }
}

/*
Benefits of OCP:
Enhances Maintainability:
Reduces the risk of introducing bugs when adding new functionality.
Improves Scalability:
Adding new features is easier without modifying existing code.
Promotes Reusability:
Code is more modular and reusable.
By adhering to the Open/Closed Principle,
you create systems that are easier to extend and maintain,
 reducing the likelihood of introducing errors in existing functionality.
 */