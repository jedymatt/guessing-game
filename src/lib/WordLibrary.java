package lib;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Random;

/**
 *
 * @author Jedy Matt
 */
public class WordLibrary {

    private static final String[] WORD_LIST = {
        "Apple",
        "Grapes",
        "Mango",
        "Pencil",
        "Table",
        "Book",
        "Bird",
        "Dog",
        "Cat"
    };

    public WordLibrary() {

    }

    private static String getWord(String[] arr, int idx) {
        return arr[idx];
    }

    public static String[] getWordsFromList(int numWords) {
        return getWords(WORD_LIST, numWords);
    }

    public static String[] getWords(String[] arr, int numWords) {
        String[] words = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            while (words[i] == null) {
                int idx = new Random().nextInt(arr.length);
                if (!arrayContains(words, getWord(arr, idx))) {
                    words[i] = getWord(arr, idx);
                }
            }
        }
        return words;
    }

    private static boolean arrayContains(String[] arr, String word) {
        for (String str : arr) {
            try {
                if (str.equals(word)) {
                    return true;
                }
            } catch (NullPointerException ex) {

            }
        }
        return false;
    }

}
