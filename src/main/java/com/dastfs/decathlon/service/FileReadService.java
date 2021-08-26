package com.dastfs.decathlon.service;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileReadService {

    public List<String> readFile(String path) {
        List<String> readLine = new ArrayList<>();
        try{
            File file = new File(path);
            InputStream inputStream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

           while(reader.ready()){
               readLine.add(reader.readLine());
           }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return readLine;
    }

}
