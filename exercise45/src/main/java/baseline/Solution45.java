/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

public class Solution45 {
    public static void main(String[] args) {
        //create wordFinder object variable instance to use methods of class
        wordFinder app = new wordFinder();

        //invoke method read to read specific file and store contents in class
        //if method returns true, no error occured. Otherwise, if error, exit program.
        if(!app.read()){
            System.exit(0);
        }

        //invoke method parse to parse read text from specific file and do computations on it
        if(!app.parse()){
            System.exit(0);
        }

        //invoke method write to write parsed results to specific output file
        if(!app.write()){
            System.exit(0);
        }
    }
}
