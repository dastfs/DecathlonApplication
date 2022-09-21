package com.dastfs.decathlon;

import com.dastfs.decathlon.model.AthletePerformance;
import com.dastfs.decathlon.service.calculator.Calculator;
import com.dastfs.decathlon.service.calculator.iaaf.CalculatorIAAF;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import static org.junit.jupiter.api.Assertions.*;


public class CalculationTest {

    Calculator calculator;
    AthletesTestData athletePerformance;

    @BeforeEach
    void setUp() {
       calculator = new CalculatorIAAF();
       athletePerformance = new AthletesTestData();
    }

    @Test
    void checkWithNoData(){
        AthletePerformance performance = athletePerformance.athleteWithNoData();
        assertEquals(0, calculator.calculateTotalPoints(performance));
    }

    @Test
    void checkValidResult9127() {
        AthletePerformance performance = athletePerformance.athleteWithResult9127();
        assertEquals(9127, calculator.calculateTotalPoints(performance));
    }

    @Test
    void checkValidResult9050() {
        AthletePerformance performance = athletePerformance.athleteWithResult9050();
        assertEquals(9050, calculator.calculateTotalPoints(performance));
    }

    @Test
    void check100m(){
        assertEquals(963, calculator.calculate100m(10.55));
    }

    @Test
    void checkLongJump(){
        assertEquals(1010, calculator.calculateLongJump(7.80));
    }

    @Test
    void checkShotPut() {
        assertEquals(851, calculator.calculateShotPut(16.00));
    }

    @Test
    void checkHighJump() {
        assertEquals(850, calculator.calculateHighJump(2.05));
    }

    @Test
    void check400m() {
        assertEquals(889, calculator.calculate400m(48.42));
    }

    @Test
    void check110mHurdles() {
        assertEquals(1007, calculator.calculate110mHurdles(13.75));
    }

    @Test
    void checkDiscusThrow() {
        assertEquals(882, calculator.calculateDiscusThrow(50.54));
    }

    @Test
    void checkPoleVault() {
        assertEquals(1051, calculator.calculatePoleVault(5.45));
    }

    @Test
    void checkJavelinThrow() {
        assertEquals(918, calculator.calculateJavelinThrow(71.90));
    }

    @Test
    void check1500m() {
        assertEquals(706, calculator.calculate1500m(LocalTime.of(0, 4, 36).toSecondOfDay()));
    }

}
