package com.dastfs.decathlon.service.file.read;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadService {

    public List<String> readFileByLine(String path) {
        List<String> readLine = new ArrayList<>();
        File file = new File(path);
        try (InputStream inputStream = new FileInputStream(file);
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {

            while (reader.ready()) {
                readLine.add(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return readLine;
    }

}
