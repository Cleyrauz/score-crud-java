package com.orchestra.model;

public class Score {

    public String tittle;

    public int year;

    public String author;

    @Override
    public String toString() {
        return "Score{" +
                "tittle='" + tittle + '\'' +
                ", year=" + year +
                ", author='" + author + '\'' +
                '}';
    }
}
