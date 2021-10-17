package baseline;

import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class productSearch {
    //create private String builder object to hold product information data
    private static final StringBuilder foundItem = new StringBuilder();
    //create private Gson objects to use Gson methods to parse Json file
    private static final Gson gson = new Gson();
    //private string variable "search" to hold user input search string
    private String search;

    public boolean setSearch(String search){
        if(search.equals("")){
            //return false if string is empty as a name to search for is asked
            return false;
        }else {
            //set search to this class's search variable
            this.search = search;
            return true;
        }
    }

    public String getProduct() throws FileNotFoundException{
        //create Object "object" to hold conversion of file data/exercise44_input.json
        //to java object
        Object object = gson.fromJson(new FileReader("data/exercise44_input.json"),Object.class);
        //split object by [ and ] and } to remove unnecessary formatting characters and store elements in string array
        String[] items = object.toString().split("\\[")[1].split("]")[0].split("}");

        //remove comas and { from elements of the json conversion input in a for loop
        for(int i = 0; i < items.length; i++){
            items[i] = items[i].replace(", ", "");
            items[i] = items[i].replace("{","");
        }

        //for each item in string array
        for(String item : items){
            //define string variable "substring" to hold the name of the current item using substring method
            String substring = item.substring(item.indexOf("name=") + 5, item.indexOf("price="));

            //if substring of name equals user search variable name
            if(substring.equals(search)){
                //append name, price, and quantity to string builder object and return string builder to string
                foundItem.append("Name: ").append(substring).append("\n");
                foundItem.append("Price: ").append(String.format("%.2f",Double.valueOf(item.substring(item.indexOf("price=")+6, item.indexOf("quantity="))))).append("\n");
                foundItem.append("Quantity: ").append(String.format("%.0f",Double.valueOf(item.substring(item.indexOf("quantity=")+9))));
                return foundItem.toString();
            }
        }
        //when the for loop completes and nothing was found, return empty string
        return "";
    }
}
