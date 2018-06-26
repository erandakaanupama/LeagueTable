package com.eab;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

    private String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(T team){
        if (this.teams.contains(team)){
            System.out.println("Team " + team.getName() + " have already added");
            return false;
        }
        this.teams.add(team);
        System.out.println("Team " + team.getName() + " added to the league");
        return true;
    }

    public void showLeageTable(){
        Collections.sort(this.teams);
        for (T team :
                this.teams) {
            System.out.println(team.getName() + ": " + team.ranking());

        }
    }
}
