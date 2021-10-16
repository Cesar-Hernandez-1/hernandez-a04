package baseline;

import java.util.Scanner;

public class Solution44 {
    //create scanner object to get input from user
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create productSearch object instance variable to use class methods
        productSearch app = new productSearch();

        //try
        //while true
        //prompt user what the product name is
        //use method setSearch and scanner object to sent user input to store in class
        app.setSearch();
        //use method getProduct to get product information if found, if search not there
            //function returns empty string
        app.getProduct();

        //if method returned not the empty string, display product info and break

        //else, output apology and state product not found

        //catch exception
        //print stack trace
    }
}
