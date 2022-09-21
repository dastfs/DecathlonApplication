package com.dastfs.decathlon.service.decathlon;

import com.dastfs.decathlon.model.AthletePerformance;
import com.dastfs.decathlon.model.AthleteResult;
import com.dastfs.decathlon.service.calculator.Calculator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DecathlonScore {

    private final Calculator calculator;

    public DecathlonScore(Calculator calculator) {
        this.calculator = calculator;
    }

    public List<AthleteResult> getAthletesResults(List<AthletePerformance> performances) {
        performances.forEach((performance) ->
                performance.setResult(calculator.calculateTotalPoints(performance)));

        performances.sort(Comparator.comparing(AthletePerformance::getResult).reversed());
        return mapAthleteResults(performances);
    }

    private List<AthleteResult> mapAthleteResults(List<AthletePerformance> performances) {
        List<AthleteResult> result = new ArrayList<>();
        int position = 1;

        for (int i = 0; i < performances.size(); i++) {
            if (i != 0 && performances.get(i).getResult() != performances.get(i - 1).getResult()) {
                position++;
            }

            AthleteResult athleteResult = new AthleteResult(performances.get(i).getName(), position, performances.get(i).getResult());
            result.add(athleteResult);
        }

        return result;
    }
}
