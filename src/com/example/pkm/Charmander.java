package com.example.pkm;

import java.util.ArrayList;

public class Charmander extends Pokemon implements Startable{

    public Charmander() {
      //  super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.idNumber = 4;
        super.description = "Charmander is a bipedal, reptilian Pokémon with a primarily orange body and blue eyes. "+
        "Charmander can be found in hot, mountainous areas.";
        super.type = Type.FIRE;
        super.expPoints = 40;
        super.healthPoints = 55;
        super.MAX_HEALTH = healthPoints;
        super.movesArray = new ArrayList<Moves>(4);
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
