package baseline;

import java.util.ArrayList;
import java.util.List;

public class FileList {

    private List<String> names = new ArrayList<>;




    public void sortNames(){
        //sort names list
        names.sort();
    }

    public int getNamesCount(){
    return names.size();
    }

     public String getNames(){
        return names;
     }

    public void removeNamesFromFile(String file){
    //unused-not needed for current assignment parameters
    }

    public void removeName(String name){
    //unused-not needed for current assignment parameters
    }

    public void toString(){
        //set to return list of names
        return null
    }

    public void addNamesFromFile(String file) {
        //read file
        //while hasnext
        //add next line to name Array list
    }

    public void addName(String name) {
        //add string input to array list
        //used to testing
    }
}
