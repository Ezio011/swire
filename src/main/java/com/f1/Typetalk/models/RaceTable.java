package com.f1.Typetalk.models;

import java.util.Objects;

public class RaceTable {
    public Race Race;
    public int season;
    public int round;
    public String text;

    public com.f1.Typetalk.models.Race getRace() {
        return Race;
    }

    public void setRace(com.f1.Typetalk.models.Race race) {
        Race = race;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RaceTable raceTable = (RaceTable) o;
        return season == raceTable.season && round == raceTable.round && Objects.equals(Race, raceTable.Race) && Objects.equals(text, raceTable.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Race, season, round, text);
    }

    @Override
    public String toString() {
        return "RaceTable{" +
                "Race=" + Race +
                ", season=" + season +
                ", round=" + round +
                ", text='" + text + '\'' +
                '}';
    }
}
