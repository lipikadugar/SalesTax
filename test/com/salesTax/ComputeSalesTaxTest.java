package com.salesTax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputeSalesTaxTest {

    @Test
    public void shouldGiveTheResultIfTheItemIsImportedAndExempted() {
        ComputeSalesTax compute = new ComputeSalesTax(10.00);

        assertEquals(0.50, compute.taxForImportedProducts(), 0);
    }

    @Test
    public void shouldGiveTheResult21IfThePriceOfImportedAndExemptedItemIs20() {
        ComputeSalesTax compute = new ComputeSalesTax(20.00);

        assertEquals(1.00, compute.taxForImportedProducts(), 0);
    }

    @Test
    public void shouldGiveTaxForImportedAndUnExemptedItem() {
        ComputeSalesTax compute = new ComputeSalesTax(50.00);

        assertEquals(7.5, compute.taxForImportedAndUnExemptedProducts(), 0);
    }
}
