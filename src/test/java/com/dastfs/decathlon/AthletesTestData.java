package com.dastfs.decathlon;

import com.dastfs.decathlon.model.AthletePerformance;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class AthletesTestData {

    public AthletePerformance athleteWithResult9127() {
        return new AthletePerformance.AthleteBuilder("athleteWithResult9127")
                .run100m(10.55)
                .longJump(7.80)
                .shotPut(16.00)
                .highJump(2.05)
                .run400m(48.42)
                .run110mHurdles(13.75)
                .discusThrow(50.54)
                .poleVault(5.45)
                .javelinThrow(71.90)
                .run1500m(LocalTime.of(0, 4, 36).toSecondOfDay())
                .build();
    }

    public AthletePerformance athleteWithNoData() {
        return new AthletePerformance.AthleteBuilder("athleteWithNoData")
                .build();
    }

    public AthletePerformance athleteWithResult9050() {
        return new AthletePerformance.AthleteBuilder("athleteWithResult9050")
                .run100m(10.23)
                .longJump(7.88)
                .shotPut(14.52)
                .highJump(2.01)
                .run400m(45.00)
                .run110mHurdles(13.69)
                .discusThrow(43.43)
                .poleVault(5.20)
                .javelinThrow(63.63)
                .run1500m(LocalTime.of(0, 4, 17).toSecondOfDay())
                .build();
    }

    public AthletePerformance athleteWithResult9033() {
        return new AthletePerformance.AthleteBuilder("athleteWithResult9033")
                .run100m(10.64)
                .longJump(8.11)
                .shotPut(15.33)
                .highJump(2.12)
                .run400m(47.79)
                .run110mHurdles(13.92)
                .discusThrow(47.92)
                .poleVault(4.80)
                .javelinThrow(70.16)
                .run1500m(LocalTime.of(0, 4, 21).toSecondOfDay())
                .build();
    }

    public List<AthletePerformance> athletePerformanceList() {
        return Arrays.asList(
                athleteWithResult9127(),
                athleteWithResult9033(),
                athleteWithResult9050(),
                athleteWithResult9033());
    }
}
