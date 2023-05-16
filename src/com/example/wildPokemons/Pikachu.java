package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Pikachu extends Pokemon {
    public Pikachu() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """
                             Pikachu is a short, chubby rodent Pokémon. 
                             It is covered in yellow fur with two horizontal brown stripes on its back.
                             """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;

        super.idNumber = 25;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.ELECTRIC;
    }
}
