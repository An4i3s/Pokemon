package com.example.pkm;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;



public abstract class Pokemon {

    protected int idNumber;
    protected String description;
    protected Type type;
    protected String nickname;
    protected int expPoints;
    protected  int healthPoints;
   // private int getHealthPoints = healthPoints;
    protected  int  MAX_HEALTH;
    protected List<Moves> movesArray = new ArrayList<>(4);


 /*   public int getHealthPoints() {
        return healthPoints;
    }*/

    public Pokemon() {
   // this.MAX_HEALTH= Integer.valueOf(getHealthPoints());
    }

    public Pokemon(int idNumber, String description, Type type, String nickname, int expPoints, int healthPoints, Moves moves, int maxHealth) {
        this.idNumber = idNumber;
        this.description = description;
        this.type = type;
        this.nickname = nickname;
        this.expPoints = expPoints;
        this.healthPoints = healthPoints;
        this.movesArray = movesArray;
        //new
       //this.MAX_HEALTH = this.getHealthPoints();

    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMAX_HEALTH() {
        return MAX_HEALTH;
    }

    public void showDetails(){
        System.out.println("Pokemon n# "+idNumber+  " is "+getClass().getSimpleName());
        System.out.println("Nickname: "+nickname);
        System.out.println("Type: "+type);
       // System.out.println("Health Points: "+healthPoints);
        System.out.println(healthPoints);
        System.out.println(MAX_HEALTH);
    }

    public void learnMove(int index, int damage, String name){
        movesArray.add(index, new Moves(damage,name));
    }

    public void showMoves(){
        System.out.println("Moves learned:");
        int index = 1;
        if (movesArray.isEmpty()){
            System.out.println("No moves learned yet!");
        }
        for (Moves move:movesArray) {
            System.out.println(index+" "+move);
            index++;
        }
    }

}
