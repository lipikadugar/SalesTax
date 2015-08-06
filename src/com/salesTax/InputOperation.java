package com.salesTax;

public class InputOperation {
    private String splitInput[];

    public InputOperation(String input) {
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
        return Double.parseDouble(splitInput[splitInput.length - 1]);
    }

    public boolean isExempted() {
        for (String itemType : splitInput) {
            if (itemType.equals("chocolate") || itemType.equals("book"))
                return true;
        }
        return false;
    }
}
