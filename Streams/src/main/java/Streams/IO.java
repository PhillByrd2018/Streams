package Streams;

import java.lang.String;
import java.util.stream.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.io.IOException;

/**
 * file IO to a stream that is then used to remove bad data
 */
public final class IO {
    private IO() {
    }

    /**
     * Use a data.txt file to step through the data and look for empty rows to exclude from our check
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Starting the Stream");

        System.out.println("--------------------------------------");
        System.out.println("The file before cleaning up");

        Stream<String> rows1 = Files.lines(Paths.get("Streams/src/main/java/Streams/data.txt")); //needed the full relative path to make this work/


        rows1.forEach(System.out::println);
        System.out.println("--------------------------------------");

        System.out.println("The file after cleaning up");

        Stream<String> rows2 = Files.lines(Paths.get("Streams/src/main/java/Streams/data.txt")); //needed the full relative path to make this work/

        rows2.filter(x-> x.split(",").length>=3)
        .forEach(System.out::println);
       


        System.out.println("--------------------------------------");



        System.out.println("Finished with the Stream");

    }
}