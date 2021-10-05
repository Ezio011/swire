package com.f1.Typetalk.models;

import java.util.Objects;

public class Constructor {
    public String Name;
    public String Nationality;
    public String constructorId;
    public String url;
    public String text;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getConstructorId() {
        return constructorId;
    }

    public void setConstructorId(String constructorId) {
        this.constructorId = constructorId;
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
        Constructor that = (Constructor) o;
        return Objects.equals(Name, that.Name) && Objects.equals(Nationality, that.Nationality) && Objects.equals(constructorId, that.constructorId) && Objects.equals(url, that.url) && Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Nationality, constructorId, url, text);
    }

    @Override
    public String toString() {
        return "Constructor{" +
                "Name='" + Name + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", constructorId='" + constructorId + '\'' +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
