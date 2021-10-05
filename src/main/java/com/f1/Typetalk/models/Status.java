package com.f1.Typetalk.models;

import java.util.Objects;

public class Status {
    public int statusId;
    public String text;

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
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
        Status status = (Status) o;
        return statusId == status.statusId && Objects.equals(text, status.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(statusId, text);
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusId=" + statusId +
                ", text='" + text + '\'' +
                '}';
    }
}
