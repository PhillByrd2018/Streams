package Streams;

import java.lang.String;
import java.util.stream.*;
import java.util.*;
import java.lang.*;
import java.io.*;


/**
 * basic Collection stream with mapping functionality implemented for filtering
 */
public final class Collection {
    private Collection() {
    }

    /**
     * Runs through a list of people and filters to a new list collection
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

        System.out.println("filter the list of names to only those that contain 'i' ");

        List<String> people2 = people.stream() //create a new list that is the result of this stream
            .filter(x -> x.contains("i")) //filter out names that do not have the letter 'i' in them
            .collect(Collectors.toList()); //create the return list to send to the declaration of this statement

            people2.forEach(System.out::println); //print the contents of the new List
            

        System.out.println("--------------------------------------");

        System.out.println("filter the list of names to exclude those that contain 'i' ");

        List<String> noIPeople = people.stream()
            .filter(x->!x.contains("i"))
            .collect(Collectors.toList());

            noIPeople.forEach(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("filter the list of names to exclude those that contains 'csqi' ");
        
        List<String> noEIPeople = people.stream()
            .filter(x->!x.contains("q"))
            .filter(x->!x.contains("i"))
            .filter(x->!x.contains("c"))
            .filter(x->!x.contains("d"))
            .collect(Collectors.toList());

            noEIPeople.forEach(System.out::println);



        System.out.println("--------------------------------------");


        System.out.println("Finished with the Stream");

    }
}