package com.dastfs.decathlon.service.file.export;

import com.dastfs.decathlon.model.AthleteResult;

import java.util.List;

public interface FileExporter {
    void export(List<AthleteResult> results, String path);
}
