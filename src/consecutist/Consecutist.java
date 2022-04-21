package consecutist;

import java.util.*;

public class Consecutist {

    static String pruneConsecutiveCharacters(String word, int maxConsecutiveChars) {
        if (maxConsecutiveChars == 0) return "";



        return word;
    }

    public static List<String> collectSegmentsOfRepeats(String word) {
        List<String> segments = new ArrayList<>();
        String[] letters = word.split("");

        String segment = "";
        String letterFromPreviousIteration = "";
        for (int i = 0; i < letters.length; i++) {

            String letter = letters[i];
            if (!letter.equalsIgnoreCase(letterFromPreviousIteration) && !letterFromPreviousIteration.isEmpty()) {
                segments.add(segment);
                segment = "";
            }
            segment = segment.concat(letter);
            letterFromPreviousIteration = letter;
        }
        segments.add(segment);

        return segments;
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
