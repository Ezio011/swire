package com.f1.Typetalk.models;

import java.util.Objects;

public class FastestLap {
    public String Time;
    public AvgSpeed AverageSpeed;
    public int rank;
    public int lap;
    public String text;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public AvgSpeed getAverageSpeed() {
        return AverageSpeed;
    }

    public void setAverageSpeed(AvgSpeed averageSpeed) {
        AverageSpeed = averageSpeed;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getLap() {
        return lap;
    }

    public void setLap(int lap) {
        this.lap = lap;
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
        FastestLap that = (FastestLap) o;
        return rank == that.rank && lap == that.lap && Objects.equals(Time, that.Time) && Objects.equals(AverageSpeed, that.AverageSpeed) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Time, AverageSpeed, rank, lap, text);
    }

    @Override
    public String toString() {
        return "FastestLap{" +
                "Time='" + Time + '\'' +
                ", AverageSpeed=" + AverageSpeed +
                ", rank=" + rank +
                ", lap=" + lap +
                ", text='" + text + '\'' +
                '}';
    }
}
