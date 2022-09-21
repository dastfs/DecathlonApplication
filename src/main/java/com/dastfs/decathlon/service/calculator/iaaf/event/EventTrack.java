package com.dastfs.decathlon.service.calculator.iaaf.event;

import com.dastfs.decathlon.service.calculator.iaaf.ScoringTableIAAF;

public class EventTrack implements Event{
    @Override
    public int calculate(double performance, ScoringTableIAAF scoringTable) {
        double result = scoringTable.getA() * Math.pow(scoringTable.getB() - performance, scoringTable.getC());
        return (int) result;
    }
}
