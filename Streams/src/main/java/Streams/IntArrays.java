package Streams;

import java.lang.String;
import java.util.stream.*;
import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * basic Int arrays stream with averaging functionality implemented 
 */
public final class IntArrays {
    private IntArrays() {
    }

    /**
     * Runs through an Int Stream to find the average of numbers
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        System.out.println("Starting the Stream");

        System.out.println("--------------------------------------");

        System.out.println("Making a map and finding the average of all the values");

        Arrays.stream(new int[] {2,4,6,8,10}) //is a stream containing these values
            .map(x -> x * x) //creates a map of these vaules as keys and the values squared as the value of the map
            .average() // the we will have the average of all the elements
            .ifPresent(System.out::println); //printing the value if it exists



        System.out.println("--------------------------------------");
    

        System.out.println("Finished with the Stream");

    }
}