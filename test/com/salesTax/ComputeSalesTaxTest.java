package com.salesTax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputeSalesTaxTest {

    @Test
    public void shouldGiveTheResultIfTheItemIsImportedAndExempted() {
        ComputeSalesTax compute = new ComputeSalesTax(10.00);

        assertEquals(0.50, compute.taxForImportedProductsAndExemptedProducts(), 0);
    }

    @Test
    public void shouldGiveTheResult21IfThePriceOfImportedAndExemptedItemIs20() {
        ComputeSalesTax compute = new ComputeSalesTax(20.00);

        assertEquals(1.00, compute.taxForImportedProductsAndExemptedProducts(), 0);
    }

    @Test
    public void shouldGiveTaxForImportedAndUnExemptedItemAs7Rupees50Paisa() {
        ComputeSalesTax compute = new ComputeSalesTax(50.00);

        assertEquals(7.5, compute.taxForImportedAndUnExemptedProducts(), 0);
    }

    @Test
    public void shouldGiveTaxForImportedAndUnExemptedItemAs4Rupees35Paisa() {
        ComputeSalesTax compute = new ComputeSalesTax(29.00);

        assertEquals(4.35, compute.taxForImportedAndUnExemptedProducts(), 0);
    }

    @Test
    public void shouldGiveTheTaxForUnImportedAndUnExemptedItemAs1Rupees8Paisa() {
        ComputeSalesTax compute = new ComputeSalesTax(18);

        assertEquals(1.8 , compute.taxForUnImportedAndUnExemptedItem(), 0);
    }

    @Test
    public void shouldGiveTaxForUnImportedAndUnExemptedItemAs() {
        ComputeSalesTax compute = new ComputeSalesTax(72);

        assertEquals(7.2, compute.taxForUnImportedAndUnExemptedItem(), 0);
    }
}
