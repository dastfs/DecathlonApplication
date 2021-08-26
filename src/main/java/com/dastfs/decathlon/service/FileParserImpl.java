package com.dastfs.decathlon.service;

import com.dastfs.decathlon.model.Athlete;
import com.dastfs.decathlon.model.Decathlon;

import java.util.List;
import java.util.stream.Collectors;

public class FileParserImpl implements IFileParser {

    private FileReadService fileReadService;

    public FileParserImpl(){
        fileReadService = new FileReadService();
    }
    @Override
    public List<Athlete> getAthleteList(String filePath) {
        List<String> lines = fileReadService.readFile(filePath);
        return lines.stream().map(this::getAthlete).collect(Collectors.toList());
    }

    private Athlete getAthlete(String line){
        String[] parms = line.split(";");
        return new Athlete.AthleteBuilder(parms[Decathlon.NAME.getIndex()])
                .highJump(convertToDouble(parms[Decathlon.HIGHJUMP.getIndex()]))
                .shotJump(convertToDouble(parms[Decathlon.SHOTJUMP.getIndex()]))
                .longJump(convertToDouble(parms[Decathlon.LONGJUMP.getIndex()]))
                .hurdles110m(convertToDouble(parms[Decathlon.HURDLES110M.getIndex()]))
                .poleVault(convertToDouble(parms[Decathlon.POLEVAULT.getIndex()]))
                .run100m(convertToDouble(parms[Decathlon.RUN100M.getIndex()]))
                .run400m(convertToDouble(parms[Decathlon.RUN400M.getIndex()]))
                .run1500m(convertToDouble(parms[Decathlon.RUN1500M.getIndex()]))
                .throwDiscus(convertToDouble(parms[Decathlon.THROWDISCUS.getIndex()]))
                .throwJavelin(convertToDouble(parms[Decathlon.THROWJAVELIN.getIndex()]))
                .build();
    }

    public static double convertToDouble(String str){
        return Double.parseDouble(str);
    }
}
