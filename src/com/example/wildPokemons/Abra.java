package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Abra extends Pokemon {
    public Abra() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """ 
                Abra is a bipedal mammalian Pokémon that is primarily yellow. 
                Its face is kite-shaped with a small, pale yellow snout and two short, pointed ears with pale yellow interiors.
                """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 63;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.PSYCHIC;
    }
}
