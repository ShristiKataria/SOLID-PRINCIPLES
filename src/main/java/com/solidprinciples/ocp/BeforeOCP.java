package com.solidprinciples.ocp;

public class BeforeOCP {

    //    Suppose we have a class that calculates discounts based on customer type:
    public double calculateDiscount(String customerType, double amount) {
        if (customerType.equals("Regular")) {
            return amount * 0.1;
        } else if (customerType.equals("Premium")) {
            return amount * 0.2;
        }
        return 0;
    }

    /*
    Problems:

Adding a new customer type requires modifying the existing class.
This can introduce bugs and requires re-testing the entire class.
     */
}
