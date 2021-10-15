package baseline;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class dataParse {
    //create private static final list of strings to hold names from file named "names"
    private static final List<String> names = new ArrayList<>();
    //create private string builder named "table" to hold table of formatted data
    private static final StringBuilder table = new StringBuilder();

    public boolean read() {
        //try with recourses

        //create file object with pathname "data/exercise42_input.txt"
        //create scanner object named "fileReader" initialized to read data from above file
        //while the file has a next line
        //add to "names" the file's next line
        //return true

        //catch exception if file not found
        //print out error message
        //return false
    }


    public boolean parse(){
        //try

        //create integer variable named "counter"
        //append header of table to stringBuilder "table" object

        //use enhanced for loop for each string name in "names"

        //for length of string name

        //if the character at current position is ',', append spaces to format table
        //set counter to 0

        //else, increment counter and append the current character

        //append new line to "table"

        //return true

        //catch exception
        //return false
    }

    public String output(){
        //return table represented as string using toString method
    }
}
