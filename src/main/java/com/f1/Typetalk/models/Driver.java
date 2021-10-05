package com.f1.Typetalk.models;

import java.util.Date;
import java.util.Objects;

public class Driver {
    public int PermanentNumber;
    public String GivenName;
    public String FamilyName;
    public Date DateOfBirth;
    public String Nationality;
    public String driverId;
    public String code;
    public String url;
    public String text;

    public int getPermanentNumber() {
        return PermanentNumber;
    }

    public void setPermanentNumber(int permanentNumber) {
        PermanentNumber = permanentNumber;
    }

    public String getGivenName() {
        return GivenName;
    }

    public void setGivenName(String givenName) {
        GivenName = givenName;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
        Driver driver = (Driver) o;
        return PermanentNumber == driver.PermanentNumber && Objects.equals(GivenName, driver.GivenName) && Objects.equals(FamilyName, driver.FamilyName) && Objects.equals(DateOfBirth, driver.DateOfBirth) && Objects.equals(Nationality, driver.Nationality) && Objects.equals(driverId, driver.driverId) && Objects.equals(code, driver.code) && Objects.equals(url, driver.url) && Objects.equals(text, driver.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PermanentNumber, GivenName, FamilyName, DateOfBirth, Nationality, driverId, code, url, text);
    }

    @Override
    public String toString() {
        return "Driver{" +
                "PermanentNumber=" + PermanentNumber +
                ", GivenName='" + GivenName + '\'' +
                ", FamilyName='" + FamilyName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", Nationality='" + Nationality + '\'' +
                ", driverId='" + driverId + '\'' +
                ", code='" + code + '\'' +
                ", url='" + url + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
