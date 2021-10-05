package com.f1.Typetalk.models;

import java.util.Date;
import java.util.Objects;

public class Race {
    public String RaceName;
    public Circuit Circuit;
    public Date Date;
    public Date Time;
    public ResultsList ResultsList;
    public int season;
    public int round;
    public String url;
    public String text;

    public String getRaceName() {
        return RaceName;
    }

    public void setRaceName(String raceName) {
        RaceName = raceName;
    }

    public com.f1.Typetalk.models.Circuit getCircuit() {
        return Circuit;
    }

    public void setCircuit(com.f1.Typetalk.models.Circuit circuit) {
        Circuit = circuit;
    }

    public java.util.Date getDate() {
        return Date;
    }

    public void setDate(java.util.Date date) {
        Date = date;
    }

    public java.util.Date getTime() {
        return Time;
    }

    public void setTime(java.util.Date time) {
        Time = time;
    }

    public com.f1.Typetalk.models.ResultsList getResultsList() {
        return ResultsList;
    }

    public void setResultsList(com.f1.Typetalk.models.ResultsList resultsList) {
        ResultsList = resultsList;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
        Race race = (Race) o;
        return season == race.season && round == race.round && Objects.equals(RaceName, race.RaceName) && Objects.equals(Circuit, race.Circuit) && Objects.equals(Date, race.Date) && Objects.equals(Time, race.Time) && Objects.equals(ResultsList, race.ResultsList) && Objects.equals(url, race.url) && Objects.equals(text, race.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RaceName, Circuit, Date, Time, ResultsList, season, round, url, text);
    }

    @Override
    public String toString() {
        return "Race{" +
                "RaceName='" + RaceName + '\'' +
                ", Circuit=" + Circuit +
                ", Date=" + Date +
                ", Time=" + Time +
                ", ResultsList=" + ResultsList +
                ", season=" + season +
                ", round=" + round +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
