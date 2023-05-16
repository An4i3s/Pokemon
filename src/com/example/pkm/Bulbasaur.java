package com.example.pkm;

import java.util.ArrayList;
import java.util.List;

public class Bulbasaur extends Pokemon implements Startable{
    public Bulbasaur() {
        //super(nickname);
        super.description = "Bulbasaur. It bears the seed of a plant on its back from birth. " +
                "\nBulbasaur are extremely tough and very difficult to capture in the wild.\n";
        super.expPoints = 30;
        super.healthPoints = 50;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 1;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.GRASS;

    }
}
