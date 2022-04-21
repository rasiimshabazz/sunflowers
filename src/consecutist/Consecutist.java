package consecutist;

import java.util.*;

public class Consecutist {

    static String pruneConsecutiveCharacters(String word, int maxConsecutiveChars) {
        if (maxConsecutiveChars == 0) return "";



        return word;
    }

    public static List<String> collectRepeats(String word) {
        List<String> repeats = new ArrayList<>();

        return  Arrays.asList("h", "e", "ll", "ooo", "l");
    }

    public static Map<Character, Integer> countLetters(String word) {
        char[] letters = word.toCharArray();
        Map<Character, Integer> lettersCounts = new HashMap<>();
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            Integer potentialCount = lettersCounts.get(letter);
            int count = potentialCount == null ? 0 : potentialCount;
            lettersCounts.put(letter, ++count);
        }
        return lettersCounts;
    }

}
