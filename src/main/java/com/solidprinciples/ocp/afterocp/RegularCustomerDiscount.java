package com.solidprinciples.ocp.afterocp;

import com.solidprinciples.ocp.afterocp.Discount;

public class RegularCustomerDiscount implements Discount {
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}
