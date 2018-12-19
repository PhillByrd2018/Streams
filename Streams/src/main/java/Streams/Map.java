package Streams;

import java.lang.String;
import java.util.stream.*;
import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * basic Int arrays stream with mapping functionality implemented for filtering
 */
public final class Map {
    private Map() {
    }

    /**
     * Runs through a list of people and filters to a map
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        System.out.println("Starting the Stream");

        System.out.println("--------------------------------------");

        System.out.println("List of names");
        List<String> people = Arrays.asList("Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia");
        people.stream()
            .forEach(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("converting the list of names to all lower case");

        people.stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("m"))
            .forEach(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("converting the list of names to all upper case");

        people.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("Finished with the Stream");

    }
}