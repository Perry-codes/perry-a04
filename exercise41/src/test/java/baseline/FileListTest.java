/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FileListTest {

    @Test
    void sortNames() {
        //tests add name function implicitly
        FileList test = new FileList();
        test.addName("Perry, Maggie");
        test.addName("Doe, John");
        test.sortNames();
        //test sort worked to swap name order
        assertEquals("Doe, John",test.getNames(0));
    }

    @Test
    void printToFile() {
        //void printToFile(String outputFile)
        FileList test = new FileList();
        test.addName("Perry, Maggie");
        test.addName("Doe, John");
        //write to file
        test.printToFile("data/testOutput1.txt");
        assertTrue(Files.exists(Path.of("data/testOutput1.txt")));
    }

    @Test
    void printToFileRead() throws FileNotFoundException {
        //void printToFile(String outputFile)
        FileList test = new FileList();
        test.addName("Perry, Maggie");
        test.addName("Doe, John");
        //write to file
        test.printToFile("data/testOutput2.txt");
        Scanner sc = new Scanner(new File("data/testOutput2.txt"));
        String line = sc.nextLine();
        assertEquals("Total of 2 names",line);
    }

    @Test
    void addNamesFromFile() throws FileNotFoundException {
        //void addNamesFromFile(String file)
        FileList f = new FileList("data/testFile.txt");

        assertEquals("Struggle, Doctor",f.getNames(1));
    }

}