package org.example.entity;

public enum Continent {

    ASIA(0),
    EUROPE(1),
    NORTH_AMERICA(2),
    AFRICA(3),
    OCEANIA(4),
    ANTARCTICA(5),
    SOUTH_AMERICA(6);

    private final int value;

    Continent(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
