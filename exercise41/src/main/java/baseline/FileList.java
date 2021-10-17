/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Maggie Perry
 */

package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileList {

    private List<String> names = new ArrayList<String>();

    public FileList(String fileName) throws FileNotFoundException {
        addNamesFromFile(fileName);
    }

    public FileList() {
        //empty constructor for testing
    }

    public void sortNames(){
        //sort names list
        Collections.sort(names);
    }

     public String getNames(int index){
        return names.get(index);
     }

    public void printToFile(String outputFile){
        //set to return list of names
        try (Formatter output = new Formatter(outputFile)){
            output.format("Total of %d names%n%s%n",names.size(),"------------------");
            for (String name : names) {
                output.format("%s%n", name);
            }
        } catch (SecurityException | FileNotFoundException | FormatterClosedException e){
            System.err.println("An error has occurred.");
            e.printStackTrace();
        }
    }

    private void addNamesFromFile(String file) throws FileNotFoundException {
        //Scanner to read the file
        Scanner s = new Scanner( new File(file) );
        //read file
        //while hasnext
        while(s.hasNextLine()){
            //add next line to name Array list
            names.add(s.nextLine());
        }
        s.close();
    }

    public void addName(String name) {
        //add string input to array list
        //used to testing
        names.add(name);
    }
}
