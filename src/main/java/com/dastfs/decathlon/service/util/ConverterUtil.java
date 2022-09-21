package com.dastfs.decathlon.service.util;

import com.dastfs.decathlon.exception.ConvertException;

import java.time.LocalTime;

public class ConverterUtil {
    public static double convertToDouble(String str) {
        try{
            return Double.parseDouble(str);
        } catch (Exception exception){
            return 0;
        }
    }

    public static int convertToSeconds(String value) {
        try {
            String[] split = value.trim().split("\\.");
            LocalTime time = LocalTime.of(0, Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            return time.toSecondOfDay();
        } catch (Exception e) {
            throw new ConvertException("Error when converting parameter to seconds: {" + value + "}");
        }
    }
}
