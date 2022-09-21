package com.dastfs.decathlon;

import com.dastfs.decathlon.model.AthleteResult;
import com.dastfs.decathlon.service.calculator.Calculator;
import com.dastfs.decathlon.service.calculator.iaaf.CalculatorIAAF;
import com.dastfs.decathlon.service.decathlon.DecathlonScore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ScoreTest {

    DecathlonScore decathlonScore;
    Calculator calculator;
    AthletesTestData athletePerformanceData;

    @BeforeEach
    void setUp(){
        athletePerformanceData = new AthletesTestData();
        calculator = new CalculatorIAAF();
        decathlonScore = new DecathlonScore(calculator);
    }

    @Test
    void checkGetAthletesResults(){
        List<AthleteResult> athleteResults = decathlonScore.getAthletesResults(athletePerformanceData.athletePerformanceList());
        assertEquals(4, athleteResults.size());

        assertEquals(1, athleteResults.get(0).getPosition());
        assertEquals(9127, athleteResults.get(0).getTotalScore());
        assertEquals("athleteWithResult9127", athleteResults.get(0).getName());

        assertEquals(3, athleteResults.get(3).getPosition());
        assertEquals(9033, athleteResults.get(3).getTotalScore());
        assertEquals("athleteWithResult9033", athleteResults.get(3).getName());
    }

    @Test
    void checkIsSameResultsSharePlaces(){
        List<AthleteResult> athleteResults = decathlonScore.getAthletesResults(athletePerformanceData.athletePerformanceList());
        assertEquals(2, athleteResults.get(1).getPosition());
        assertEquals(3, athleteResults.get(3).getPosition());
    }

}
