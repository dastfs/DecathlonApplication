package com.dastfs.decathlon;

import com.dastfs.decathlon.model.Athlete;
import com.dastfs.decathlon.model.DecathlonResult;
import com.dastfs.decathlon.service.FileParserImpl;
import com.dastfs.decathlon.service.IFileParser;

import java.util.List;

public class DecathlonApplication {

    private static IFileParser fileParser;
    private static DecathlonResult decathlonResult;

    DecathlonApplication() {
        fileParser = new FileParserImpl();
    }

    public static void main(String[] args) {
        DecathlonApplication decathlonApplication = new DecathlonApplication();
        decathlonApplication.start();
    }

    private void start(){
        List<Athlete> athleteList = fileParser.getAthleteList("");

    }
    public static String getName(){
        return "Decathlon test";
    }
}
