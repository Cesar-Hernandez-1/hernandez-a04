package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

public class websiteGen {
    //create string builder to create output of created directories
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
        try{
            //set this name to received name
            this.name = name;
            //return true
            return true;
        }
        //catch exception
        catch (Exception e){
            //print stack trace
            e.printStackTrace();
            //return false
            return false;
        }
    }

    public boolean setAuthor(String author){
        //try
        try{
            //set this author to received author name
            this.author = author;
            //return true
            return true;
        }
        //catch exception
        catch (Exception e){
            //print stack trace
            e.printStackTrace();
            //return false
            return false;
        }
    }

    public boolean setJavaScript(String answer){
        //try
        try{
            //set boolean javaScript to true if received string is "y", false otherwise
            javaScript = Objects.equals(answer, "y");
            //return true
            return true;
        }//catch exception
        catch (Exception e){
            //print stack strace
            e.printStackTrace();
            //return false
            return false;
        }
    }

    public boolean setCSS(String answer){
        //try
        try{
            //set boolean css to true if received string is "y", false otherwise
            css = Objects.equals(answer, "y");
            //return true
            return true;
        }//catch exception
        catch (Exception e){
            //print stack strace
            e.printStackTrace();
            //return false
            return false;
        }
    }

    public String create() throws IOException{
        //create File object with path "data/website/" + name
        File file = new File("data/website/" + name);
        //if directories created, append created message to "created" string builder
        if(file.mkdirs()){
            created.append("Created data/website/").append(name).append("\n");
        }

        //create file object with path from above + "/index.html" appended at the end
        File file2 = new File(file.getPath() + "/index.html");
        //create filewriter object with path defined one comment above
        FileWriter writeFile2 = new FileWriter(file2.getPath());
        //write to filewriter object the html file with the specified information
        writeFile2.write("""
                <!DOCTYPE html>
                <html>
                <head>
                  <title>""" + name + """
                </title>
                <meta name = "author" content= \"""" + author + """
                ">
                </head>
                <body>

                <h1>This is a heading</h1>
                <p>This is a paragraph.</p>

                </body>
                </html>""");
        //append created message to created string builder
        created.append("Created data/website/").append(name).append("/index.html").append("\n");
        //close filewriter object
        writeFile2.close();

        //if javaScript boolean is true, create directory and append created message
        if(javaScript && new File("data/website/" + name + "/js/").mkdir()){
            created.append("Created data/website/").append(name).append("/js/").append("\n");
        }

        //if css boolean is true, create directory and append created message
        if(css && new File("data/website/" + name + "/css/").mkdir()){
            created.append("Created data/website/").append(name).append("/css/").append("\n");
        }

        //return messages from "created" with method toString
        return created.toString();
    }
}
