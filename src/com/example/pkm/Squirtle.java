package com.example.pkm;

import java.util.ArrayList;

public class Squirtle extends Pokemon implements Startable{
    public Squirtle() {
        //super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.idNumber = 7;
        super.description = "Squirtle is a small reptilian Pokémon that resembles a light-blue turtle."+
        "\nSquirtle's shell is a useful tool. It can withdraw into the shell for protection or to sleep.";
        super.type = Type.WATER;
        super.expPoints = 60;
        super.healthPoints = 55;
        super.MAX_HEALTH = healthPoints;
        super.movesArray = new ArrayList<>(4);
    }

    @Override
    public void showDetails() {
        super.showDetails();
    }

    @Override
    public void learnMove(int index, int damage, String name) {
        super.learnMove(index, damage, name);
    }
}
