package com.dastfs.decathlon.model;

public class AthleteResult {
    private final String name;
    private final int position;
    private final double totalScore;

    public AthleteResult(String name, int position, double totalScore) {
        this.name = name;
        this.position = position;
        this.totalScore = totalScore;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public double getTotalScore() {
        return totalScore;
    }

    @Override
    public String toString() {
        return "DecathlonResultService{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", totalScore=" + totalScore +
                '}';
    }
}
