/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

public class Solution41 {
    public static void main(String[] args) {
        //create nameSorter object variable to use methods of class object instance
        nameSorter app = new nameSorter();

        //invoke read function to read the required file's contents
        //function returns true if read was successful, false otherwise
        if(!app.read()){
            System.exit(0);
        }

        //invoke sort method to sort names from the read function in alphabetical order
        //function returns ture if sort was successful, false otherwise.
        if(!app.sort()){
            System.exit(0);
        }

        //invoke output method to write sorted names to text output file.
        app.output();
    }
}
