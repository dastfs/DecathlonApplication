package com.dastfs.decathlon.model;

public class DecathlonResult {
    private String name;
    private int place;
    private double totalScore;

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "DecathlonResultService{" +
                "name='" + name + '\'' +
                ", place=" + place +
                ", totalScore=" + totalScore +
                '}';
    }
}
