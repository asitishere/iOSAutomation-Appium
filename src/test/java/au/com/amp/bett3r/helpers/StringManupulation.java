package au.com.amp.bett3r.helpers;

/**
 * Created by asit on 24/11/2015.
 */
public class StringManupulation {

    public static String[] splitTheWordToChar(String word){

        String[] wordList= word.split("(?!^)");
        return wordList;
    }
}
