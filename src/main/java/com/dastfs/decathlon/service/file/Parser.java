package com.dastfs.decathlon.service.file;

import com.dastfs.decathlon.model.AthletePerformance;

import java.util.List;

public interface Parser {
    List<AthletePerformance> parseAthletesRecords(String path);
}
