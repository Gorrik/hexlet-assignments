package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


// BEGIN
public class App {

    public static boolean scrabble(String setOfLetters, String word) {

        List<String> wordArray = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));
        List<String> setOfLettersArray = new ArrayList<>(Arrays.asList(setOfLetters.toLowerCase().split("")));

            for (String el : wordArray) {

                if(!setOfLettersArray.contains(el)) return false;

                setOfLettersArray.remove(el);
            }
            return true;

    }

    public static void main(String[] args) {

        boolean result = App.scrabble("thlxertwq", "hexlet");

        String word, setOfLetters;

        word = "hexlet";
        setOfLetters = "thlxertwq";

        List<String> wordArray = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));
        List<String> setOfLettersArray = new ArrayList<>(Arrays.asList(setOfLetters.toLowerCase().split("")));

        System.out.println(wordArray+"\n"+setOfLettersArray);







    }


}
//END
