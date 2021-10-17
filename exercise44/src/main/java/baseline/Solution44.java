package baseline;

import java.util.Scanner;

public class Solution44 {
    //create scanner object to get input from user
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //create productSearch object instance variable to use class methods
        productSearch app = new productSearch();

        //try
        try{
            //while true
            while(true){
                //prompt user what the product name is
                System.out.print("What is the product name? ");
                //use method setSearch and scanner object to sent user input to store in class
                boolean successSetSearch = app.setSearch(input.nextLine());
                //use method getProduct to get product information if found, if search not there
                //function returns empty string
                String output = app.getProduct();
                //if method returned not the empty string, display product info and break
                if(successSetSearch && !output.equals("")){
                    System.out.println(output);
                    break;
                }//else, output apology and state product not found
                else{
                    System.out.print("Sorry, that product was not found in our inventory.\n");
                }
            }
        }//catch exception
        catch (Exception e){
            //print stack trace
            e.printStackTrace();
        }
    }
}
