package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nameSorter {
    //create private static final list of strings to hold names from file named "names"
    private static final List<String> names = new ArrayList<>();
    //create private boolean flag to determine if a file was successfully read
    private boolean fileRead = false;

    public boolean read(String pathName){
        //try with recourses
        //create file object with pathname "data/exercise41_input.txt"
        //create scanner object named "fileReader" initialized to read data from above file
        try (Scanner fileReader = new Scanner(new File(pathName))){
            //while the file has a next line
            while (fileReader.hasNextLine()) {
                //add to "names" the file's next line
                names.add(fileReader.nextLine());
            }
            //set flag to true
            fileRead = true;
            //return true
            return true;
        }
        //catch exception if file not found
        catch (Exception e) {
            //set flag to false
            fileRead = false;
            //return false
            return false;
        }
    }

    public boolean sort(){
        //if a file was not successfully read before parsing, return false as an error occured
        if(!fileRead){
            return false;
        }

        //for each element in "names"
        for (int i = 0; i < names.size(); i++) {
            //for each element in "names"
            for (int j = 0; j < names.size(); j++) {
                //if index plus one is the size of "names", break
                if (j + 1 == names.size()) {
                    break;
                }
                //String variable "name1" holds current element name
                String name1 = names.get(j);
                //String variable "name2" holds next element name
                String name2 = names.get(j + 1);

                //if first character of "name1" is greater than first character in "name2"
                if (name1.charAt(0) > name2.charAt(0)) {
                    //swap names by setting current element as "name2" and next element as "name1"
                    names.set(j, name2);
                    names.set(j + 1, name1);
                }
            }
        }

        //for each element in "names"
        for (int i = 0; i < names.size(); i++) {
            //for each element in "names"
            for (int j = 0; j < names.size(); j++) {
                //if index plus one is the size of "names", break
                if (j + 1 == names.size()) {
                    break;
                }
                //String variable "name1" holds current element name
                String name1 = names.get(j);
                //String variable "name2" holds next element name
                String name2 = names.get(j + 1);

                //if the lastname of name1 and name2 match and if first letter of name1 is
                //greater than the first letter of the first name of name2, swap them.
                //swap names by setting current element as "name2" and next element as "name1"
                if (name1.substring(0, name1.indexOf(",")).equals(name2.substring(0, name1.indexOf(","))) &&
                        name1.charAt(name1.indexOf(" ") + 1) > name2.charAt(name2.indexOf(" ") + 1)) {
                    names.set(j, name2);
                    names.set(j + 1, name1);
                }
            }
        }
        //return true
        return true;
    }

    public void output(){
        //try
        //to create FileWriter object named "writeFile" with file name path "data/exercise41_output.txt"
        try(FileWriter writeFile = new FileWriter("data/exercise41_output.txt")) {

            //write header and number of names using "names.size()" function
            writeFile.write("Total of " + names.size() + " names\n" +
                    "-----------------\n");


            //use enhanced for loop for each string name in "names"
            for (String name : names) {

                //write the name and new line to the file using writeFile object

                writeFile.write(name + "\n");
            }
            //clear list for next use
            names.clear();
        }
        //catch IOException
        catch (IOException e){
            //print stack trace
            e.printStackTrace();
        }
    }
}
