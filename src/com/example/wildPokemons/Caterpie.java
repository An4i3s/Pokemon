package com.example.wildPokemons;

import com.example.pkm.Moves;
import com.example.pkm.Pokemon;
import com.example.pkm.Type;

import java.util.ArrayList;

public class Caterpie extends Pokemon {
    public Caterpie(int idNumber, String description, Type type, String nickname, int expPoints, int healthPoints, Moves moves, int maxHealth) {
        super(idNumber, description, type, nickname, expPoints, healthPoints, moves, maxHealth);
    }

    public Caterpie() {
       // super(idNumber, description, type, nickname, expPoints, healthPoints, movesArray);
        super.idNumber = 10;
        super.description = """
                Caterpie is an insect Pokémon that resembles a green caterpillar.
                Caterpie is easy to capture and grows quickly, making it ideal for new Trainers.
                """;
        super.type = Type.BUG;
        super.expPoints = 20;
        super.healthPoints = 30;
        super.MAX_HEALTH = healthPoints;
        super.movesArray = new ArrayList<>(4);
    }


}
