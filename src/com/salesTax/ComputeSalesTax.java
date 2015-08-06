package com.salesTax;

public class ComputeSalesTax {
    private double price;

    public ComputeSalesTax(double price) {
        this.price = price;
    }

    public double taxForImportedProductsAndExemptedProducts() {
        return price * 5 / 100;
    }

    public double taxForImportedAndUnExemptedProducts() {
        return taxForImportedProductsAndExemptedProducts() + taxForUnImportedAndUnExemptedItem();
    }

    public double taxForUnImportedAndUnExemptedItem() {
        return price * 10 / 100;
    }
}
