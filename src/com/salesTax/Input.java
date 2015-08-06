package com.salesTax;

public class Input {
    private String input;
    private String splitInput[];

    public Input(String input) {
        this.input = input;
        splitInput = input.split(" ");
    }

    public boolean isImported() {
        for (String itemType : splitInput) {
            if (itemType.equals("imported"))
                return true;
        }
        return false;
    }

    public double getPrice() {
        return 27.99;
    }
}
