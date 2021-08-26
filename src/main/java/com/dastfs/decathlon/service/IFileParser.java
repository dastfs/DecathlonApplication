package com.dastfs.decathlon.service;

import com.dastfs.decathlon.model.Athlete;

import java.util.List;

public interface IFileParser {
    List<Athlete> getAthleteList(String filePath);
}
