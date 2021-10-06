package com.f1.Typetalk.models;

import java.util.Objects;

public class MRData {
    public RaceTable RaceTable;
    public String xmlns;
    public String series;
    public String url;
    public int limit;
    public int offset;
    public int total;
    public String text;

    public com.f1.Typetalk.models.RaceTable getRaceTable() {
        return RaceTable;
    }

    public void setRaceTable(com.f1.Typetalk.models.RaceTable raceTable) {
        RaceTable = raceTable;
    }

    public String getXmlns() {
        return xmlns;
    }

    public void setXmlns(String xmlns) {
        this.xmlns = xmlns;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
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
        MRData mrData = (MRData) o;
        return limit == mrData.limit && offset == mrData.offset && total == mrData.total && Objects.equals(RaceTable, mrData.RaceTable) && Objects.equals(xmlns, mrData.xmlns) && Objects.equals(series, mrData.series) && Objects.equals(url, mrData.url) && Objects.equals(text, mrData.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RaceTable, xmlns, series, url, limit, offset, total, text);
    }

    @Override
    public String toString() {
        return "MRData{" +
                "RaceTable=" + RaceTable +
                ", xmlns='" + xmlns + '\'' +
                ", series='" + series + '\'' +
                ", url='" + url + '\'' +
                ", limit=" + limit +
                ", offset=" + offset +
                ", total=" + total +
                ", text='" + text + '\'' +
                '}';
    }
}