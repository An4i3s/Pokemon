package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Vulpix extends Pokemon {
    public Vulpix() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """
                Vulpix is a small, quadrupedal, canine Pokémon. 
                It has a red-brown pelt with a cream-colored underbelly.
                """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 37;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.FIRE;
    }
}
