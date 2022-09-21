package com.dastfs.decathlon.service.calculator.iaaf.event;

import com.dastfs.decathlon.service.calculator.iaaf.ScoringTableIAAF;

public class EventField implements Event{
    @Override
    public int calculate(double performance, ScoringTableIAAF scoringTable) {
        double result = scoringTable.getA() * Math.pow(performance - scoringTable.getB(), scoringTable.getC());
        return (int) result;
    }

}
