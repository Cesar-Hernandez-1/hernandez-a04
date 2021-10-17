/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

public class Solution46 {
    public static void main(String[] args) {
        //create wordFrequency object instance to use methods
        wordFrequency app = new wordFrequency();

        //use method read to read the specific file
        if(!app.read("data/exercise46_input.txt")){
            System.exit(0);
        }

        //use method parse to sort the read text and compute word frequency
        if(!app.parse()){
            System.exit(0);
        }

        //use method output to return a string table of word frequency on file's text
        //store return value in string variable named "output"
        String output = app.output();

        //output table to user
        System.out.println(output);
    }
}
