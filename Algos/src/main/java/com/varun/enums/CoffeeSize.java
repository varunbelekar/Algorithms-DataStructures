package com.varun.enums;

public enum CoffeeSize {
    MEDIUM("MEDIUM", 12),
    LARGE("LARGE", 16),
    SMALL("SMALL", 8);

    private final String label;
    private final int ounce;

    CoffeeSize(String label, int ounce) {
        this.label = label;
        this.ounce = ounce;
    }

    public String getLabel() {
        return label;
    }

    public int getOunce() {
        return ounce;
    }
}
