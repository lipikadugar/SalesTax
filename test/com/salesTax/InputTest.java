package com.salesTax;

import org.junit.Assert;
import org.junit.Test;

public class InputTest {

    @Test
    public void shouldBeAbleToIdentifyTheImportedProducts() {
        Input item = new Input("1 imported bottle of perfume at 27.99");

        Assert.assertEquals(true, item.isImported());
    }
}
