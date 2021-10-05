package com.f1.Typetalk.models;

import java.util.Objects;

public class Results {
    public Driver Driver;
    public Constructor Constructor;
    public int Grid;
    public int Laps;
    public Status Status;
    public Time Time;
    public FastestLap FastestLap;
    public int number;
    public int position;
    public int positionText;
    public int points;
    public String text;

    public com.f1.Typetalk.models.Driver getDriver() {
        return Driver;
    }

    public void setDriver(com.f1.Typetalk.models.Driver driver) {
        Driver = driver;
    }

    public com.f1.Typetalk.models.Constructor getConstructor() {
        return Constructor;
    }

    public void setConstructor(com.f1.Typetalk.models.Constructor constructor) {
        Constructor = constructor;
    }

    public int getGrid() {
        return Grid;
    }

    public void setGrid(int grid) {
        Grid = grid;
    }

    public int getLaps() {
        return Laps;
    }

    public void setLaps(int laps) {
        Laps = laps;
    }

    public com.f1.Typetalk.models.Status getStatus() {
        return Status;
    }

    public void setStatus(com.f1.Typetalk.models.Status status) {
        Status = status;
    }

    public com.f1.Typetalk.models.Time getTime() {
        return Time;
    }

    public void setTime(com.f1.Typetalk.models.Time time) {
        Time = time;
    }

    public com.f1.Typetalk.models.FastestLap getFastestLap() {
        return FastestLap;
    }

    public void setFastestLap(com.f1.Typetalk.models.FastestLap fastestLap) {
        FastestLap = fastestLap;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getPositionText() {
        return positionText;
    }

    public void setPositionText(int positionText) {
        this.positionText = positionText;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
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
        Results results = (Results) o;
        return Grid == results.Grid && Laps == results.Laps && number == results.number && position == results.position && positionText == results.positionText && points == results.points && Objects.equals(Driver, results.Driver) && Objects.equals(Constructor, results.Constructor) && Objects.equals(Status, results.Status) && Objects.equals(Time, results.Time) && Objects.equals(FastestLap, results.FastestLap) && Objects.equals(text, results.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Driver, Constructor, Grid, Laps, Status, Time, FastestLap, number, position, positionText, points, text);
    }

    @Override
    public String toString() {
        return "Results{" +
                "Driver=" + Driver +
                ", Constructor=" + Constructor +
                ", Grid=" + Grid +
                ", Laps=" + Laps +
                ", Status=" + Status +
                ", Time=" + Time +
                ", FastestLap=" + FastestLap +
                ", number=" + number +
                ", position=" + position +
                ", positionText=" + positionText +
                ", points=" + points +
                ", text='" + text + '\'' +
                '}';
    }
}
