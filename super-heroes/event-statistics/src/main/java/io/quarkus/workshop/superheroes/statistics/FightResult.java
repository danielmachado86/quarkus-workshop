package io.quarkus.workshop.superheroes.statistics;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.time.Instant;

@RegisterForReflection
public class FightResult {

    private long id;
    private Instant fightDate;
    private String winnerName;
    private int winnerLevel;
    private String winnerPicture;
    private String loserName;
    private int loserLevel;
    private String loserPicture;
    private String winnerTeam;
    private String loserTeam;


    public long getId() {
        return id;
    }

    public Instant getFightDate() {
        return fightDate;
    }

    public String getWinnerName() {
        return winnerName;
    }

    public int getWinnerLevel() {
        return winnerLevel;
    }

    public String getWinnerPicture() {
        return winnerPicture;
    }

    public String getLoserName() {
        return loserName;
    }

    public int getLoserLevel() {
        return loserLevel;
    }

    public String getLoserPicture() {
        return loserPicture;
    }
    

    public String getWinnerTeam() {
        return winnerTeam;
    }

    public String getLoserTeam() {
        return loserTeam;
    }
}