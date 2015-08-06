package com.salesTax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputOperationTest {

    @Test
    public void shouldBeAbleToIdentifyTheImportedProducts() {
        InputOperation item = new InputOperation("1 imported bottle of perfume at 27.99");

        assertEquals(true, item.isImported());
    }

    @Test
    public void shouldReturnFalseIfTheProductIsNotImported() {
        InputOperation item = new InputOperation("1 book at 12.49");

        assertEquals(false, item.isImported());
    }

    @Test
    public void shouldReturnTrueIfImportedIsMentionedAtAnyPlaceInTheGivenString() {
        InputOperation item = new InputOperation("1 box of imported chocolates at 11.25");

        assertEquals(true, item.isImported());
    }

    @Test
    public void shouldBeAbleToGiveThePriceOfTheProduct() {
        InputOperation item = new InputOperation("1 imported bottle of perfume at 27.99");

        assertEquals(27.99, item.getPrice(), 0);
    }

    @Test
    public void shouldReturn12Rupees49PaisaIfTheInputIs1BookAt12Rupees49Paisa() {
        InputOperation item = new InputOperation("1 book at 12.49");

        assertEquals(12.49, item.getPrice(), 0);
    }

    @Test
    public void shouldGiveTrueIfTheProductIsExempted() {
        InputOperation input = new InputOperation("1 box of chocolate at 11.25");

        assertEquals(true, input.isExempted());
    }

    @Test
    public void shouldGiveFalseIfTheProductIsNotExempted() {
        InputOperation input = new InputOperation("1 perfume at 12.49");

        assertEquals(false, input.isExempted());
    }

    @Test
    public void shouldGiveExemptedIfTheProductIsBook() {
        InputOperation input = new InputOperation("1 book at 13.56");

        assertEquals(true, input.isExempted());
    }
}
