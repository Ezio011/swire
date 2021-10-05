package com.f1.Typetalk.models;

import java.util.Objects;

public class Circuit {
    public String CircuitName;
    public Location Location;
    public String circuitId;
    public String url;
    public String text;

    public String getCircuitName() {
        return CircuitName;
    }

    public void setCircuitName(String circuitName) {
        CircuitName = circuitName;
    }

    public com.f1.Typetalk.models.Location getLocation() {
        return Location;
    }

    public void setLocation(com.f1.Typetalk.models.Location location) {
        Location = location;
    }

    public String getCircuitId() {
        return circuitId;
    }

    public void setCircuitId(String circuitId) {
        this.circuitId = circuitId;
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
        Circuit circuit = (Circuit) o;
        return Objects.equals(CircuitName, circuit.CircuitName) && Objects.equals(Location, circuit.Location) && Objects.equals(circuitId, circuit.circuitId) && Objects.equals(url, circuit.url) && Objects.equals(text, circuit.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CircuitName, Location, circuitId, url, text);
    }

    @Override
    public String toString() {
        return "Circuit{" +
                "CircuitName='" + CircuitName + '\'' +
                ", Location=" + Location +
                ", circuitId='" + circuitId + '\'' +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
