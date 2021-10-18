/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Cesar Hernandez
 */

package baseline;

import java.io.IOException;
import java.util.Scanner;

public class Solution43 {
    //create scanner object for user input
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create websiteGen object instance variable to use methods
        websiteGen app = new websiteGen();

        //use method setName to get String name of website
        System.out.print("Site name: ");
        if(!app.setName(input.nextLine())){
            System.out.println("Site contains illegal character.");
            System.exit(0);
        }
        //use method setAuthor to get Author's name
        System.out.print("Author: ");
        if(!app.setAuthor(input.nextLine())){
            System.out.println("No author name provided.");
            System.exit(0);
        }
        //use method setJavaScript to determine if a javascript folder should be made
        System.out.print("Do you want a folder for JavaScript? ");
        if(!app.setJavaScript(input.nextLine())){
            System.out.println("Character expected.");
            System.exit(0);
        }
        //use method setCSS to determine if a css folder should be made
        System.out.print("Do you want a folder for css? ");
        if(!app.setCSS(input.nextLine())){
            System.out.println("Character expected.");
            System.exit(0);
        }
        //try and use method create to return a string of all directories that were creates
        //output string to user
        try{
            String output = app.create();
            System.out.println(output);
        }
        //catch IOException and print stack trace
        catch (
                IOException e){
            e.printStackTrace();
        }
    }
}
