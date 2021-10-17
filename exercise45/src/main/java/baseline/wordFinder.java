package baseline;

public class wordFinder {
    //create private static final string builder to hold text to be written to output file
    private static final StringBuilder fileText = new StringBuilder();

    public boolean read(){
        //try with recourses to create buffered reader object with the path of data/exercise45_input.txt
        //Create string variable "line"
        //while the next line read from the file that is stores in line is not null
        //append the line and a new line to the string builder
        //return true

        //catch exception
        //return false
    }

    public boolean parse(){
        //try
        //to replace string builder's text of "utilize" to "use" from the start to the end of the file
        //use string builder's method of replace
        //return true

        //catch exception
        //return false
    }

    public boolean write(){
        //try
        //to create file writer object with path of data/exercise45_output.txt
        //write string builder's toString text to exercise45_output.txt using write method
        //close file writer object
        //return true

        //catch exception
        //return false
    }
}
