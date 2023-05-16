package com.example.wildPokemons;

import com.example.pkm.Moves;
import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Butterfree extends Pokemon {
    public Butterfree() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = "Butterfree is a lepidopteran insect Pokémon which resembles a vaguely anthropomorphic butterfly with a purple body";
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 12;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.BUG;
    }
}
