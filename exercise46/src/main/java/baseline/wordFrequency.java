package baseline;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class wordFrequency {
    //create private static final map of string and integers
    private static final Map<String, Integer> words = new HashMap<>();
    //create private static final linkedhashmap of string and integers
    private static final LinkedHashMap<String, Integer> sortedWords = new LinkedHashMap<>();
    //create private string builder graph to store output graph to user
    private StringBuilder graph = new StringBuilder();

    public boolean read(){
        //try
        //to create file object with path data/exercise46_input.txt
        //create scanner object with scanner constructor sent file object from above
        //while scanner object on file has next line
        //define string variable word with the file's next line of text
        //use enhanced for loop, for each text word in the line of text split by a space
        //if the map contains the word, add one to the integer data
        //else set word as key and set int data to 1
        //close scanner object
        //return true

        //catch exception
        //print file not found
        //return false
    }

    public boolean parse(){
        //try
        //sort map by largest integer data first and least integer data last.
        //use map entry set method with stream and sorted method
        //then, sort by comparing reverse order value for each value from key
        //store sorted map in linked hash map
        //return true

        //catch exception
        //print stack trace
        //return false
    }

    public String output(){
        //using enhanced for loop, for each string and integer map element in sorted hash map
        //append the word (as map key) and ":" to string builder
        //append spaces to format graph evenly
        //append "*" to string builder as many times it appeared in the file, using repeat method
        //append a new line character

        //return the string builder using toString method
    }
}
