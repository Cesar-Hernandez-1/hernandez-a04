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
        try (Scanner fileReader = new Scanner(new File("data/exercise42_input.txt"))){
            //while the file has a next line
            while (fileReader.hasNextLine()) {
                //add to "names" the file's next line
                names.add(fileReader.nextLine());
            }
            //return true
            return true;
        }
        //catch exception if file not found
        catch (Exception e) {
            //print out error message
            System.out.println("File not found");
            //return false
            return false;
        }
    }


    public boolean parse(){
        //try
        try{
            //create integer variable named "counter"
            int counter;
            //append header of table to stringBuilder "table" object
            table.append("""
                Last      First     Salary
                --------------------------
                """);

            //use enhanced for loop for each string name in "names"
            for(String name : names){
                //set counter to 0
                counter = 0;
                //for length of string name
                for(int i = 0; i < name.length(); i++){

                    //if the character at current position is ',', append spaces to format table
                    if (name.charAt(i) == ','){
                        table.append(" ".repeat(Math.max(0, (10 - counter))));
                        //set counter to 0
                        counter = 0;
                    }else{
                        //else, increment counter and append the current character
                        counter++;
                        table.append(name.charAt(i));
                    }
                }
                //append new line to "table"
                table.append("\n");
            }
            //return true
            return true;
        }
        //catch exception
        catch (Exception e){
            //return false
            return false;
        }
    }

    public String output(){
        //return table represented as string using toString method
        return table.toString();
    }
}
