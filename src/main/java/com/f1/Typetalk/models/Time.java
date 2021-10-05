package com.f1.Typetalk.models;

import java.util.Date;
import java.util.Objects;

public class Time {
    public int millis;
    public Date text;

    public int getMillis() {
        return millis;
    }

    public void setMillis(int millis) {
        this.millis = millis;
    }

    public Date getText() {
        return text;
    }

    public void setText(Date text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Time time = (Time) o;
        return millis == time.millis && Objects.equals(text, time.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(millis, text);
    }

    @Override
    public String toString() {
        return "Time{" +
                "millis=" + millis +
                ", text=" + text +
                '}';
    }
}
