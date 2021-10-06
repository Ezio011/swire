package com.f1.Typetalk.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Objects;

@JsonIgnoreProperties
public class ResultsList {
    public List<Results> Result;

    public List<Results> getResult() {
        return Result;
    }

    public void setResult(List<Results> result) {
        Result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultsList that = (ResultsList) o;
        return Objects.equals(Result, that.Result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Result);
    }

    @Override
    public String toString() {
        return "ResultsList{" +
                "Result=" + Result +
                '}';
    }
}
