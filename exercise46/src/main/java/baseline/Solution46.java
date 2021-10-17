package baseline;

public class Solution46 {
    public static void main(String[] args) {
        //create wordFrequency object instance to use methods
        wordFrequency app = new wordFrequency();

        //use method read to read the specific file
        app.read();

        //use method parse to sort the read text and compute word frequency
        app.parse();

        //use method output to return a string table of word frequency on file's text
        //store return value in string variable named "output"
        app.output();

        //output table to user
    }
}
