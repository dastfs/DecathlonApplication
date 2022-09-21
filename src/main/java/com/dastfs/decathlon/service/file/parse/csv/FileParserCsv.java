package com.dastfs.decathlon.service.file.parse.csv;

import com.dastfs.decathlon.model.AthletePerformance;
import com.dastfs.decathlon.service.file.Parser;
import com.dastfs.decathlon.service.file.parse.FileParser;
import com.dastfs.decathlon.service.file.read.FileReadService;

import java.util.List;
import java.util.stream.Collectors;

import static com.dastfs.decathlon.service.util.ConverterUtil.*;

public class FileParserCsv implements Parser, FileParser {

    private final FileReadService fileReadService;

    public FileParserCsv(FileReadService fileReadService) {
        this.fileReadService = fileReadService;
    }

    @Override
    public List<String> parseFile(String filePath) {
        return fileReadService.readFileByLine(filePath);
    }

    @Override
    public List<AthletePerformance> parseAthletesRecords(String path) {
         List<String> athletes = parseFile(path);
         return athletes.stream().map(this::getAthlete).collect(Collectors.toList());
    }

    private AthletePerformance getAthlete(String line){
        String[] athleteRecords = line.split(";");

        return new AthletePerformance.AthleteBuilder(athleteRecords[IndexesCsv.NAME.getIndex()])
                .run100m(convertToDouble(athleteRecords[IndexesCsv.RUN100M.getIndex()]))
                .longJump(convertToDouble(athleteRecords[IndexesCsv.LONGJUMP.getIndex()]))
                .shotPut(convertToDouble(athleteRecords[IndexesCsv.SHOTPUT.getIndex()]))
                .highJump(convertToDouble(athleteRecords[IndexesCsv.HIGHJUMP.getIndex()]))
                .run110mHurdles(convertToDouble(athleteRecords[IndexesCsv.RUN110MHURDLES.getIndex()]))
                .poleVault(convertToDouble(athleteRecords[IndexesCsv.POLEVAULT.getIndex()]))
                .run400m(convertToDouble(athleteRecords[IndexesCsv.RUN400M.getIndex()]))
                .discusThrow(convertToDouble(athleteRecords[IndexesCsv.DISCUSTHROW.getIndex()]))
                .javelinThrow(convertToDouble(athleteRecords[IndexesCsv.JAVELINTHROW.getIndex()]))
                .run1500m(convertToSeconds(athleteRecords[IndexesCsv.RUN1500M.getIndex()]))
                .build();
    }



}
