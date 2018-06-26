package com.eab;

public class Main {

    public static void main(String[] args) {

        FootballPlayer mesi = new FootballPlayer("mesi");
        FootballPlayer karl = new FootballPlayer("karl");

        Team<FootballPlayer> argentina = new Team<>("Argentina");
        argentina.addPlayer(mesi);
        argentina.addPlayer(karl);

        BaseballPlayer tom = new BaseballPlayer("tom");
        Team<FootballPlayer> rawTeam = new Team<>("raw Team");
        //rawTeam.addPlayer(tom);

        FootballPlayer ronaldo = new FootballPlayer("ronaldo");
        Team<FootballPlayer> brasil = new Team<>("brasil");
        brasil.addPlayer(ronaldo);

        Team<FootballPlayer> spain = new Team<>("spain");
        FootballPlayer kalo = new FootballPlayer("kalo");
        spain.addPlayer(kalo);

        argentina.matchResult(brasil,3,2);
        argentina.matchResult(spain,5,3);
        brasil.matchResult(argentina,3,20);

        League<Team<FootballPlayer>> footLeague = new League<>("FIFA 18");
        footLeague.addTeam(argentina);
        footLeague.addTeam(brasil);
        footLeague.addTeam(spain);
        footLeague.showLeageTable();



    }
}
