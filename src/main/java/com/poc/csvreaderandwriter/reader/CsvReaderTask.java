package com.poc.csvreaderandwriter.reader;

import com.opencsv.bean.CsvToBeanBuilder;
import com.poc.csvreaderandwriter.model.SomeDto;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvReaderTask {

    @Value("file.path")
    private String filePath;

    public void read() {




//        try {
//            BufferedReader reader = new BufferedReader(new FileReader(filePath + "/some.csv"));
//
//            reader.lines().forEach(line -> {
//                line.split(";");
//            });
//
//
//
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

    }



}
