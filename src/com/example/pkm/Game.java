package com.example.pkm;
// TODO: 10/05/2023 create methods to display and manage a Pokedex
//  (evrytime a new pkm appears it is registered, when captured a "capture" flag is set to tru ->? mod the pkm interface?)

// TODO: 10/05/2023 implements a method to learn moves

import com.example.wildPokemons.*;

import java.util.*;


import java.util.ArrayList;

public class Game {

    public static Scanner scanner = new Scanner(System.in);
    private static List<Pokemon> team = new ArrayList<>();
    private static ArrayList<Pokemon> pokedex = new ArrayList<>();
    private static final ArrayList<Pokemon> wildPokemons = new ArrayList<>();

    public static void main(String[] args) {
         boolean on = true;
         createWildPkmArray();
         pickAStarter();
         showOptions();

        while (on){
            int choice = scanner.nextInt();
            switch (choice){
                case 1-> fight();
                case 2-> goToPkmCenter();
                case 3-> usePotion(25);
                case 4-> printTeam();
                case 5-> displayPokedex();
                case 6-> showOptions();
                case 7-> on=false;
                default -> System.out.println("Invalid Input");
        }
        }

    }

    // TODO: 13/04/2023 add a static method to handle fighting + catch a pkm

    public static void usePotion(int qty){
        System.out.println("On which Pokemon do you want to use Potion?");
        printTeam();
        int pkmChoice = scanner.nextInt() -1;
        Pokemon myPkm = team.get(pkmChoice);
        myPkm.healthPoints += qty;
    }

    public static void fight(){

        double random = Math.random()* wildPokemons.size();
        Pokemon foePkm = wildPokemons.get((int) random);
        System.out.println("Wild "+foePkm.getClass().getSimpleName()+" appeared");
        pokedex.add(foePkm);
        System.out.println(foePkm.getClass().getSimpleName()+ " info was added to Pokédex");
        // TODO: 13/04/2023 implemnt the function to handle's foe turn
        // TODO: 16/04/2023 show moves
        System.out.println("Which Pokemon do you want to use?");
        printTeam();
        int pkmChoice = scanner.nextInt() -1;
        Pokemon myPkm = team.get(pkmChoice);


        while (foePkm.healthPoints > 0 && myPkm.healthPoints >0){
            System.out.println("Which move do you want to use against foePkm?");

            myPkm.showMoves();
            int moveChoice = scanner.nextInt()-1;

            switch (moveChoice){
                //System.out.println();
                case 1 -> foePkm.healthPoints -= myPkm.movesArray.get(0).damage();
                case 2 -> foePkm.healthPoints -= myPkm.movesArray.get(1).damage();
                case 3 -> foePkm.healthPoints -= myPkm.movesArray.get(2).damage();
                case 4 ->  foePkm.healthPoints -= myPkm.movesArray.get(3).damage();
            }
            System.out.println( foePkm.getClass().getSimpleName()+" health is "+foePkm.healthPoints);
            System.out.println(myPkm.getClass().getSimpleName()+" used "+myPkm.movesArray.get(moveChoice));
            System.out.println(myPkm.getClass().getSimpleName()+" inflicted "+ myPkm.movesArray.get(moveChoice).damage()+ " damage to foe");

            foePkm.healthPoints -= myPkm.movesArray.get(moveChoice).damage();
            System.out.println(foePkm.getClass().getSimpleName()+" health now is "+foePkm.healthPoints);

            myPkm.healthPoints -= 15;
            System.out.println("foe "+ foePkm.getClass().getSimpleName()+" used Slash and inflicted 15 damage to "+myPkm.getClass().getSimpleName());
            System.out.println(myPkm.getClass().getSimpleName()+ " health is now "+myPkm.healthPoints);
            System.out.println("-".repeat(20));
        }


        if (myPkm.healthPoints<=0){
            System.out.println("Foe Pokemon won!");
            System.out.println(myPkm.getClass().getSimpleName() +" is K.O.!");
        } else if (foePkm.healthPoints<= 0) {
            System.out.println("Foe Pokemon was captured!");
            // TODO: 10/05/2023 insert a function to cathc a pkm
            if(team.size() == 6){
                System.out.println("Reached Maximum Team's capacity! Max 6 pokemons allowed in team");
            }else {
                team.add(foePkm);
                team.get(team.indexOf(foePkm)).learnMove(0,10, "Cut");
            }
            printTeam();
            showOptions();
        }

    }

    public static void pickAStarter(){
        System.out.println("""
        Hello Player! Start your Pokmeon Journey!
        You can choose one these Pokemons as a starter:
        Bulbasaur
        Charmander
        Squirtle
        Which pokemon do you choose?
        """);
        String starterChoice = scanner.next();
        if (starterChoice.equalsIgnoreCase("Bulbasaur")) {
            Bulbasaur bulby = new Bulbasaur();
            System.out.println("What do you want to call your Bulbasaur?");
            bulby.nickname = scanner.next();
            team.add(bulby);
            pokedex.add(bulby);
            System.out.println(bulby.getClass().getSimpleName()+" was added to Pokedex");
            //return bulby;

        } else if (starterChoice.equalsIgnoreCase("Charmander")) {
             Charmander charmy = new Charmander();
            System.out.println("What do you want to call your Charmander?");
            String charmyNickname = scanner.next();
            charmy.nickname = charmyNickname;
            team.add(charmy);
            pokedex.add(charmy);
            System.out.println(charmy.getClass().getSimpleName()+" was added to Pokedex");
        } else if (starterChoice.equalsIgnoreCase("Squirtle")) {
            Squirtle squirtle = new Squirtle();
            System.out.println("What do you want to call your Squirtle?");
            String squirtleNickname = scanner.next();
            squirtle.nickname = squirtleNickname;
            team.add(squirtle);
            pokedex.add(squirtle);
            System.out.println(squirtle.getClass().getSimpleName()+" was added to Pokedex");
        }else {
            System.out.println("Invalid Choice! Start again!");
           // return null;
        }
        team.get(0).learnMove(0,10, "Cut");

    }

    public static void showOptions(){
        System.out.println("""
                What do you want to do?
                1- Fight
                2- Go to Pokemon Center
                3- Use a Potion
                4- Show your team
                5- Open Pokedex
                6- Show Options
                7- Exit
                """);
    }

    public static void printTeam(){
        // TODO: 17/04/2023 improve show your team method
        int index = 1;
        System.out.println("Your Pokemon Team:");
        for (var pokemon: team) {
            System.out.println("#"+index+" "+pokemon.getClass().getSimpleName());
            System.out.println("Health = "+pokemon.healthPoints);
            System.out.println("*".repeat(15));
            index++;
        }
    }

    public static void createWildPkmArray(){
        wildPokemons.add(new Caterpie());
        wildPokemons.add(new Abra());
        wildPokemons.add(new Butterfree());
        wildPokemons.add(new Vulpix());
        wildPokemons.add(new Sandshrew());
        wildPokemons.add(new Pikachu());
        wildPokemons.add(new Articuno());
        wildPokemons.add(new Jigglypuff());
    }

    public static void displayPokedex(){
        System.out.println("Pokemon found: "+pokedex.size());
        System.out.println(" ");
        for (Pokemon pkm:pokedex){
            pkm.showDetails();
        }
        showOptions();
    }

    public static void goToPkmCenter(){
        System.out.println("Welcome to the Pokemon healing center! We can restore your Pokemon Health back to health");
        for (Pokemon pkm:team){
            System.out.println("Value of Max_Health is "+pkm.MAX_HEALTH);
            System.out.println("Value of Max_Health is "+pkm.getMAX_HEALTH());
            //System.out.println("Value of Max_Health is "+pkm.getCla);
            pkm.healthPoints = pkm.MAX_HEALTH;
        }
        System.out.println("Team's health is restored!");
    }
}
