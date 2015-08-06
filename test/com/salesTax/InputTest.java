package com.salesTax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputTest {

    @Test
    public void shouldBeAbleToIdentifyTheImportedProducts() {
        Input item = new Input("1 imported bottle of perfume at 27.99");

        assertEquals(true, item.isImported());
    }

    @Test
    public void shouldReturnFalseIfTheProductIsNotImported() {
        Input item = new Input("1 book at 12.49");

        assertEquals(false, item.isImported());
    }

    @Test
    public void shouldReturnTrueIfImportedIsMentionedAtAnyPlaceInTheGivenString() {
        Input item = new Input("1 box of imported chocolates at 11.25");

        assertEquals(true, item.isImported());
    }

    @Test
    public void shouldBeAbleToGiveThePriceOfTheProduct() {
        Input item = new Input("1 imported bottle of perfume at 27.99");

        assertEquals(27.99, item.getPrice(), 0);
    }
}
