package baseline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class wordFinder {
    //create private static final string builder to hold text to be written to output file
    private static final StringBuilder fileText = new StringBuilder();

    public boolean read(String pathName){
        //try with recourses to create buffered reader object with the path of data/exercise45_input.txt
        try(BufferedReader buff = new BufferedReader(new FileReader(pathName))){
            //Create string variable "line"
            String line;
            //while the next line read from the file that is stores in line is not null
            while((line = buff.readLine()) != null){
                //append the line and a new line to the string builder
                fileText.append(line).append("\n");
            }
            //return true
            return true;
        }//catch exception
        catch (Exception e){
            //return false
            return false;
        }
    }

    public boolean parse(){
        //try
        try{
            //to replace string builder's text of "utilize" to "use" from the start to the end of the file
            //use string builder's method of replace
            fileText.replace(0, fileText.length(), fileText.toString().replace("utilize", "use"));

            //clean up extra line and white spaces made from change in text
            while(fileText.charAt(fileText.length() - 1) == ' ' || fileText.charAt(fileText.length() - 1) == '\n'){
                fileText.deleteCharAt(fileText.length() - 1);
            }

            //return true
            return true;
        }//catch exception
        catch (Exception e){
            //return false
            return false;
        }
    }

    public boolean write(){
        //try to create file writer object with path of data/exercise45_output.txt
        try(FileWriter writeFile = new FileWriter("data/exercise45_output.txt")){
            //write string builder's toString text to exercise45_output.txt using write method
            writeFile.write(fileText.toString());
            //return true
            return true;
        }//catch exception
        catch (IOException e) {
            //print stack trace
            e.printStackTrace();
            //return false
            return false;
        }
    }
}
