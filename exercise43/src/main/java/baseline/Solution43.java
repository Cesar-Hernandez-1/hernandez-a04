package baseline;

public class Solution43 {
    //create websiteGen object instance variable to use methods
    websiteGen app = new websiteGen();

    //use method setName to get String name of website
    app.setName();
    //use method setAuthor to get Author's name
    app.setAuthor();
    //use method setJavaScript to determine if a javascript folder should be made
    app.setJavaScript();
    //use method setCSS to determine if a css folder should be made
    app.setCSS();
    //try and use method create to return a string of all directories that were creates
    //output string to user
    app.create();
    //catch IOException and print stack trace
}
