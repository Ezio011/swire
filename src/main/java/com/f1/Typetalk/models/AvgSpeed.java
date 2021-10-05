package com.f1.Typetalk.models;

import java.util.Objects;

public class AvgSpeed {
    public String units;
    public double text;

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public double getText() {
        return text;
    }

    public void setText(double text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AvgSpeed avgSpeed = (AvgSpeed) o;
        return Double.compare(avgSpeed.text, text) == 0 && Objects.equals(units, avgSpeed.units);
    }

    @Override
    public int hashCode() {
        return Objects.hash(units, text);
    }

    @Override
    public String toString() {
        return "AvgSpeed{" +
                "units='" + units + '\'' +
                ", text=" + text +
                '}';
    }
}


