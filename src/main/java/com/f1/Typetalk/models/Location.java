package com.f1.Typetalk.models;

import java.util.Objects;

public class Location {
    public String Locality;
    public String Country;
    public double lat;
    public double _long;
    public String text;

    public String getLocality() {
        return Locality;
    }

    public void setLocality(String locality) {
        Locality = locality;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double get_long() {
        return _long;
    }

    public void set_long(double _long) {
        this._long = _long;
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
        Location location = (Location) o;
        return Double.compare(location.lat, lat) == 0 && Double.compare(location._long, _long) == 0 && Objects.equals(Locality, location.Locality) && Objects.equals(Country, location.Country) && Objects.equals(text, location.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Locality, Country, lat, _long, text);
    }

    @Override
    public String toString() {
        return "Location{" +
                "Locality='" + Locality + '\'' +
                ", Country='" + Country + '\'' +
                ", lat=" + lat +
                ", _long=" + _long +
                ", text='" + text + '\'' +
                '}';
    }
}
