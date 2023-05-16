package com.example.pkm;

public record Moves(int damage, String name) {
    @Override
    public String toString() {
        return name + "," + " damage: " + damage;
    }
}
