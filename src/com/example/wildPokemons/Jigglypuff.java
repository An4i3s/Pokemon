package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Jigglypuff extends Pokemon {
    public Jigglypuff() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """
                Jigglypuff is a pink Pokémon with a spherical body. 
                It has pointed ears with black insides and large, blue eyes.\s
                """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 39;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.NORMAL;
    }
}
