package Streams;

import java.lang.String;
import java.util.stream.*;
import java.util.*;


/**
 * basic string stream with sorting functionality using a filter to return the stream
 */
public final class Filter {
    private Filter() {
    }

    /**
     * Runs through an string Stream using sort to return the first elements in the stream
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Starting the Stream");

        System.out.println("--------------------------------------");

        System.out.println("Stream before Sorting");

        Stream.of("Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia")
            .forEach(x -> System.out.println(x));

        System.out.println("--------------------------------------");


        System.out.println("Sorted Stream's first element:");
        Stream.of("Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia")
            .sorted()
            .findFirst()
            .ifPresent(System.out::println);

        System.out.println("--------------------------------------");

        System.out.println("Sorted Stream");
        Stream.of("Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia")
            .sorted()
            .forEach(x -> System.out.println(x));

            System.out.println("--------------------------------------");

            System.out.println("Sorted Stream removing words that do not start with M: ");
            String[] names = {"Phill","Andrew","Toni","Matthew","Emily","Megan","Robert","Olivia"};
            Stream.of(names)
                .filter(x -> x.startsWith("M"))
                .sorted()
                .forEach(System.out::println);

            System.out.println("--------------------------------------");
    

        System.out.println("Finished with the Stream");

    }
}