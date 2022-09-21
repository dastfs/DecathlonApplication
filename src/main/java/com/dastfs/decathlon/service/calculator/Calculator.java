package com.dastfs.decathlon.service.calculator;

import com.dastfs.decathlon.model.AthletePerformance;

public interface Calculator {
    int calculate100m(double performance);
    int calculateLongJump(double performance);
    int calculateShotPut(double performance);
    int calculateHighJump(double performance);
    int calculate400m(double performance);
    int calculate110mHurdles(double performance);
    int calculateDiscusThrow(double performance);
    int calculatePoleVault(double performance);
    int calculateJavelinThrow(double performance);
    int calculate1500m(double performance);
    int calculateTotalPoints(AthletePerformance athletePerformance);
}
