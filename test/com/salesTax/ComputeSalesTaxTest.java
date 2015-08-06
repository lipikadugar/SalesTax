package com.salesTax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ComputeSalesTaxTest {

    @Test
    public void shouldGiveTheResultIfTheItemIsImportedAndExempted() {
        ComputeSalesTax compute = new ComputeSalesTax(10.00);

        assertEquals(10.50, compute.taxForImportedProducts(), 0);
    }
}
