package com.eab;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

    private String name;
    private int played;
    private int won;
    private int loss;
    private int draw;
    private ArrayList<T> players;

    public Team(String name) {
        this.name = name;
        this.won = 0;
        this.loss = 0;
        this.draw = 0;
        this.played = 0;
        this.players = new ArrayList<>();
    }

    public boolean addPlayer(T player){
        if (this.players.contains(player)){
            System.out.println("Player " + player.getName() + " have added already");
            return false;
        }
        this.players.add(player);
        System.out.println("Player " + player.getName() + " added successfully");
        return true;
    }

    public int numberOfPlayers(){
        return this.players.size();
    }

    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        }
        else if (this.ranking() < team.ranking()){
            return 1;
        }
        else return 0;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if (ourScore > theirScore){
            this.won +=1;
        }
        else if (ourScore<theirScore){
            this.loss +=1;
        }
        else {
            this.draw +=1;
        }
        this.played +=1;

        if (opponent !=null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int ranking() {
        return 2 * this.won + draw;
    }

    public String getName() {
        return name;
    }
}
