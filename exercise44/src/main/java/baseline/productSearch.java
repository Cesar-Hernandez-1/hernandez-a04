package baseline;

import java.io.FileNotFoundException;

public class productSearch {
    //create private String builder object to hold product information data

    //create private Gson object to use Gson methods to parse Json file

    //private string variable "search" to hold user input search string

    public void setSearch(String search){
        //set search to this class's search variable
    }

    public String getProduct() throws FileNotFoundException{
        //create Object object "object" to hold conversion of file data/exercise44_input.json
            //to java object
        //split object by [ and ] and } to remove unnecessary formatting characters and store elements in string array

        //remove comas and { from elements of the json conversion input in a for loop

        //for each item in string array

        //define string variable "substring" to hold the name of the current item using substring method

        //if substring of name equals user search variable name

        //append name, price, and quantity to string builder object and return string builder to string

        //when the for loop completes and nothing was found, return empty string
    }
}
