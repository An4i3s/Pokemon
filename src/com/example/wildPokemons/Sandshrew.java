package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Sandshrew extends Pokemon {
    public Sandshrew() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """
                             Sandshrew spends much of its time hidden underground in deep burrows.
                             It only emerges to lunge and drag in passing Bug-type Pokémon.
                             """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;

        super.idNumber = 27;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.GROUND;
    }
}
