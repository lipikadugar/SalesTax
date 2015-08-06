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
        double importTax = taxForImportedProducts();
        return importTax + price * 10 / 100;
    }

    public double taxForUnImportedAndUnExemptedItem() {
        return 1.8;
    }
}
