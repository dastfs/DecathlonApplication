package com.dastfs.decathlon.service.calculator.iaaf;

import com.dastfs.decathlon.model.AthletePerformance;
import com.dastfs.decathlon.service.calculator.Calculator;

public class CalculatorIAAF implements Calculator {

    private final int CM_IN_METER = 100;

    public int calculate100m(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.RUN_100M.calculate(performance): 0;
    }

    public int calculateLongJump(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.LONG_JUMP.calculate(performance * CM_IN_METER):0;
    }

    public int calculateShotPut(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.SHOT_PUT.calculate(performance):0;
    }

    public int calculateHighJump(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.HIGH_JUMP.calculate(performance * CM_IN_METER):0;
    }

    public int calculate400m(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.RUN_400M.calculate(performance):0;
    }

    public int calculate110mHurdles(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.RUN_100M_HURDLES.calculate(performance):0;
    }

    public int calculateDiscusThrow(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.DISCUS_THROW.calculate(performance):0;
    }

    public int calculatePoleVault(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.POLE_VAULT.calculate(performance * CM_IN_METER):0;
    }

    public int calculateJavelinThrow(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.JAVELIN_THROW.calculate(performance):0;
    }

    public int calculate1500m(double performance) {
        return performance != 0.0d ? ScoringTableIAAF.RUN_1500M.calculate(performance):0;
    }

    public int calculateTotalPoints(AthletePerformance athletePerformance) {
        return calculate100m(athletePerformance.getRun100m()) +
                calculateLongJump(athletePerformance.getLongJump()) +
                calculateShotPut(athletePerformance.getShotPut()) +
                calculateHighJump(athletePerformance.getHighJump()) +
                calculate400m(athletePerformance.getRun400m()) +
                calculate110mHurdles(athletePerformance.getRun110mHurdles()) +
                calculateDiscusThrow(athletePerformance.getDiscusThrow()) +
                calculatePoleVault(athletePerformance.getPoleVault()) +
                calculateJavelinThrow(athletePerformance.getJavelinThrow()) +
                calculate1500m(athletePerformance.getRun1500m());
    }



}
