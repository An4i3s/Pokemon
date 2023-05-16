package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Articuno extends Pokemon {
    public Articuno() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """ 
                Along with Zapdos and Moltres, it is one of the three Legendary birds of Kanto.
                """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 144;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.ICE;
    }
}
