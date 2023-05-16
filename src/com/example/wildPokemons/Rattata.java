package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Rattata extends Pokemon {
    public Rattata() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """
                             Rattata is a small, quadrupedal rodent Pokémon. It has purple fur with a cream-colored face, paws, and underbelly. 
                             """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 19;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.NORMAL;
    }
}
