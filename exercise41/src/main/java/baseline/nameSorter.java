package baseline;

import java.util.ArrayList;
import java.util.List;

public class nameSorter {
    //create private static final list of strings to hold names from file named "names"
    private static final List<String> names = new ArrayList<>();

    public boolean read(){
        //try

        //create file object with pathname "data/exercise41_input.txt"
        //create scanner object named "fileReader" initialized to read data from above file

        //while the file has a next line
        //add to "names" the file's next line

        //close "fileReader" scanner object
        //return true

        //catch exception if file not found
        //print out error message
        //return false

    }

    public boolean sort(){
        //try
        //for each element in "names"
        //for each element in "names"
        //if index plus one is the size of "names", break
        //String variable "name1" holds current element name
        //String variable "name2" holds next element name

        //if first character of "name1" is greater than first character in "name2"
        //swap names by setting current element as "name2" and next element as "name1"

        //for each element in "names"
        //for each element in "names"
        //if index plus one is the size of "names", break
        //String variable "name1" holds current element name
        //String variable "name2" holds next element name

        //if the lastname of name1 and name2 match and if first letter of name1 is
        //greater than the first letter of the first name of name2, swap them.
        //swap names by setting current element as "name2" and next element as "name1"
        //return true
        //catch exception if error occurred
        //return false
    }

    public void output(){
        //try
        //create FileWriter object named "writeFile" with file name path "data/exercise41_output.txt"
        //write header and number of names using "names.size()" function

        //use enhanced for loop for each string name in "names"
        //write the name and new line to the file using writeFile object

        //close writeFile
        //catch IOException
        //print stack trace
    }
}
