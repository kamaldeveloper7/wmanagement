package com.flight.initialDataSetup;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class FileUploader {

    public static List<List<String>> processFiles() throws IOException {
        List<List<String>> values;
        try(BufferedReader br= Files.newBufferedReader(Paths.get("src/main/java/com/flight/initialDataSetup/xx-sched.csv"))) {
            values = br.lines()
                    .map(line -> Arrays.asList(line.split(",")))
                    .collect(Collectors.toList());
        }
        return values;
    }
 }