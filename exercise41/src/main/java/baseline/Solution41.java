/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.io.FileNotFoundException;

public class Solution41 {

    public static void main(String[] args) throws FileNotFoundException {

        /*
        Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts
        the list alphabetically:

        Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

        Total of 7 names      --
        list # of names in the list
        -----------------     --header line
        Johnson, Jim          --alphabetic sort by last name
        Jones, Aaron....etc
         */

        //new instance of File List class
        FileList l = new FileList("data/exercise41_input.txt");
        //sort name
        l.sortNames();
        //print sorted list to file
        l.printToFile("data/exercise41_output.txt");

    }
}
