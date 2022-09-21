package com.dastfs.decathlon;

import com.dastfs.decathlon.exception.InvalidArgumentException;
import com.dastfs.decathlon.model.AthletePerformance;
import com.dastfs.decathlon.model.AthleteResult;
import com.dastfs.decathlon.service.calculator.Calculator;
import com.dastfs.decathlon.service.calculator.iaaf.CalculatorIAAF;
import com.dastfs.decathlon.service.decathlon.DecathlonScore;
import com.dastfs.decathlon.service.file.export.FileExporter;
import com.dastfs.decathlon.service.file.export.FileExporterXML;
import com.dastfs.decathlon.service.file.parse.csv.FileParserCsv;
import com.dastfs.decathlon.service.file.Parser;
import com.dastfs.decathlon.service.file.read.FileReadService;

import java.util.List;

public class DecathlonApplication {

    private final Parser parser;
    private final DecathlonScore decathlonScore;
    private final FileExporter exporter;

    DecathlonApplication() {
        parser = new FileParserCsv(new FileReadService());
        Calculator calculator = new CalculatorIAAF();
        decathlonScore = new DecathlonScore(calculator);
        exporter = new FileExporterXML();
    }

    public static void main(String[] args) {
        filePathCheck(args);
        DecathlonApplication decathlonApplication = new DecathlonApplication();
        decathlonApplication.start(args);
    }

    private static void filePathCheck(String[] args) {
        if(args.length < 1){
            throw new InvalidArgumentException("Argument {file_input_path} is missed");
        }

        if(args.length < 2){
            throw new InvalidArgumentException("Argument {file_output_path} is missed");
        }


    }

    private void start(String [] args){
        List<AthletePerformance> athletePerformances = parser.parseAthletesRecords(args[0]);
        List<AthleteResult> decathlonResult = decathlonScore.getAthletesResults(athletePerformances);
        exporter.export(decathlonResult, args[1]);
    }
}
