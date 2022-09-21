package com.dastfs.decathlon.service.calculator.iaaf.event;

import com.dastfs.decathlon.service.calculator.iaaf.ScoringTableIAAF;

public interface Event {
    int calculate(double performance, ScoringTableIAAF decathlonCompetitions);
}
