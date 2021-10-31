package com.poc.csvreaderandwriter;

import com.opencsv.bean.CsvToBeanBuilder;
import com.poc.csvreaderandwriter.model.SomeDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@SpringBootApplication
public class CsvReaderAndWriterApplication {

	public static void main(String[] args) {




		SpringApplication.run(CsvReaderAndWriterApplication.class, args);
	}

}
