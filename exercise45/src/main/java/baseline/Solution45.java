package baseline;

public class Solution45 {
    public static void main(String[] args) {
        //create wordFinder object variable instance to use methods of class
        wordFinder app = new wordFinder();

        //invoke method read to read specific file and store contents in class
        //if method returns true, no error occured. Otherwise, if error, exit program.
        app.read();

        //invoke method parse to parse read text from specific file and do computations on it
        app.parse();

        //invoke method write to write parsed results to specific output file
        app.write();
    }
}
