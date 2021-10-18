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
        //changed structure from pseudocode because original design always returned true.
        //check if site name contains illegal characters, return false if so
        if(name.contains("<") || name.contains(">") || name.contains(":") || name. contains("\"")
        || name.contains("\\") || name.contains("/") || name.contains("?") || name.contains("*") ||
           name.contains("|")){
            return false;
        }//else set site name
        else{
            //set this name to received name
            this.name = name;
            //return true
            return true;
        }
    }

    public boolean setAuthor(String author){
        //changed from pseudocode because original design always returned true
        //if author name is blank then return false
        if(Objects.equals(author, "")){
            return false;
        }else{
            //set this author to received author name
            this.author = author;
            //return true
            return true;
        }
    }

    public boolean setJavaScript(String answer){
        //if character not entered, return false as an error
        if(answer.length() != 1){
            return false;
        }
        //set boolean javaScript to true if received string is "y", false otherwise
        javaScript = answer.equals("y");
        //return true
        return true;
    }

    public boolean setCSS(String answer){
        //if character not entered, return false as an error
        if(answer.length() != 1){
            return false;
        }
        //set boolean css to true if received string is "y", false otherwise
        css = answer.equals("y");
        //return true
        return true;
    }

    public String create() throws IOException{
        String pathSegment = "data/website/";
        String prompt = "Created ";
        //create File object with path "data/website/" + name
        File file = new File(pathSegment + name);
        //if directories created, append created message to "created" string builder
        if(file.mkdirs()){
            created.append("Created ").append(pathSegment).append(name).append("\n");
        }

        //create filewriter object with path defined from above + "/index.html" appended at the end
        try(FileWriter writeFile2 = new FileWriter(file.getPath() + "/index.html")) {
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
            created.append(prompt).append(pathSegment).append(name).append("/index.html").append("\n");
            //close filewriter object
        }

        //if javaScript boolean is true, create directory and append created message
        if(javaScript && new File("data/website/" + name + "/js/").mkdir()){
            created.append(prompt).append(pathSegment).append(name).append("/js/").append("\n");
        }

        //if css boolean is true, create directory and append created message
        if(css && new File(pathSegment + name + "/css/").mkdir()){
            created.append(prompt).append(pathSegment).append(name).append("/css/").append("\n");
        }

        //return messages from "created" with method toString
        return created.toString();
    }
}
