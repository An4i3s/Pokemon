package com.example.wildPokemons;

import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Pidgey extends Pokemon {
    public Pidgey() {
     //   super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.description = """
                Pidgey is a small, plump-bodied avian Pokémon. It is primarily brown with a cream-colored face, underside, and flight feathers.
                """;
        super.expPoints = 30;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.idNumber = 16;
        super.movesArray = new ArrayList<>(4);
        super.type = Type.FLYING;
    }
}
