/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

public class Solution42 {
    public static void main(String[] args) {
        //create dataParse object instance named "app" to use the class's methods
        dataParse app = new dataParse();

        //use method read to read data from specific file. if returned value is false
        //means an error occurred and exits program
        if(!app.read("data/exercise42_input.txt")){
            System.out.println("File not found");
            System.exit(0);
        }
        //use method parse to parse read data to organize text to table format. if returned value is false
        //means an error occurred and exits program
        if(!app.parse()){
            System.exit(0);
        }
        //use method "output" to return a formatted table of employees. format is lastname, firstname, salary
        //Store table in String "output" variable
        String output = app.output();

        //output table to user
        System.out.println(output);
    }
}
