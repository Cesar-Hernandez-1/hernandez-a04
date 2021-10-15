package baseline;

import java.io.IOException;
import java.util.Scanner;

public class websiteGen {
    //create private scanner for input
    private static final Scanner input = new Scanner(System.in);
    //create stringbuilder to create output of created directories
    private static final StringBuilder created = new StringBuilder();
    //create private string name to hold name of website
    private String name;
    //create string author to hold name of author
    private String author;
    //create private boolean "javaScript" to hold is user wants this directory
    private boolean javaScript;
    //create private boolean "css" to hold is user wants this directory
    private boolean css;

    public boolean setName(String name){
        //try
        //set this name to received name
        //return true

        //catch exception
        //print stack trace
        //return false
    }

    public boolean setAuthor(String author){
        //try
        //set this author to received author name
        //return true

        //catch exception
        //print stack trace
        //return false
    }

    public boolean setJavaScript(String answer){
        //try
        //set boolean javaScript to true if received string is "y", false otherwise
        //return true

        //catch exception
        //print stack strace
        //return false
    }

    public boolean setCSS(String answer){
        //try
        //set boolean css to true if received string is "y", false otherwise
        //return true

        //catch exception
        //print stack strace
        //return false
    }

    public String create() throws IOException{
        //create File object with path "data/website/" + name
        //if directories created, append created message to "created" string builder

        //create file object with path from above + "/index.html" appended at the end
        //create filewriter object with path defined one comment above

        //write to filewriter object the html file with the specified information
        //append created message to created string builder

        //close filewriter object

        //if javaScript boolean is true, create directory and append created message

        //if css boolean is true, create directory and append created message

        //return messages from "created" with method toString
    }
}
