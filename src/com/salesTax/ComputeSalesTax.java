package com.salesTax;

public class ComputeSalesTax {
    private double price;

    public ComputeSalesTax(double price) {
        this.price = price;
    }

    public double taxForImportedProducts() {
        return price * 5 / 100;
    }

    public double taxForImportedAndUnExemptedProducts() {
        return 7.5;
    }
}
