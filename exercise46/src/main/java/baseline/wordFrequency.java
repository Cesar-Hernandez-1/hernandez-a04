package baseline;

import java.io.File;
import java.util.*;

public class wordFrequency {
    //create private static final map of string and integers
    private static final Map<String, Integer> words = new HashMap<>();
    //create private static final linked hash map of string and integers
    private static final LinkedHashMap<String, Integer> sortedWords = new LinkedHashMap<>();
    //create private string builder graph to store output graph to user
    private static final StringBuilder graph = new StringBuilder();

    public boolean read(String pathName){
        //try to create scanner object with scanner constructor sent file object with path data/exercise46_input.txt
        try(Scanner fileReader = new Scanner(new File(pathName))){
            //while scanner object on file has next line
            while(fileReader.hasNext()){
                //define string variable word with the file's next line of text
                String word = fileReader.nextLine();
                //use enhanced for loop, for each text word in the line of text split by a space
                for(String fileWord : word.split(" ")){
                    //if the map contains the word, add one to the integer data
                    if(words.containsKey(fileWord)){
                        words.put(fileWord, words.get(fileWord)+1);
                    }//else set word as key and set int data to 1
                    else{
                        words.put(fileWord, 1);
                    }
                }
            }
            //return true
            return true;
        }//catch exception
        catch (Exception e){
            //print file not found
            System.out.println("File not found");
            //return false
            return false;
        }
    }

    public boolean parse(){
        //if map is empty return false, file has nothing or error occurred in read method
        if(words.isEmpty()){
            return false;
        }else{
            //sort map by largest integer data first and least integer data last.
            //use map entry set method with stream and sorted method
            //then, sort by comparing reverse order value for each value from key
            //store sorted map in linked hash map
            //return true
            words.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> sortedWords.put(x.getKey(),x.getValue()));
            return true;
         }
    }

    public String output(){
        //using enhanced for loop, for each string and integer map element in sorted hash map
        for(Map.Entry<String, Integer> element : sortedWords.entrySet()){
            //append the word (as map key) and ":" to string builder
            graph.append(element.getKey()).append(":");
            //append spaces to format graph evenly
            graph.append(" ".repeat(Math.max(0, (10 - (element.getKey().length() + 1)))));
            //append "*" to string builder as many times it appeared in the file, using repeat method
            graph.append("*".repeat(Math.max(0, element.getValue())));
            //append a new line character
            graph.append("\n");
        }
        graph.deleteCharAt(graph.length() - 1);
        sortedWords.clear();
        words.clear();
        //return the string builder using toString method
        return graph.toString();
    }
}
