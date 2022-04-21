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
        String previousIterationLetter = "";
        for (int i = 0; i < letters.length; i++) {
            String letter = letters[i];
            if (!letter.equalsIgnoreCase(previousIterationLetter) && !previousIterationLetter.isEmpty()) {
                segments.add(segment);
                segment = "";
            }
            segment = segment.concat(letter);
            previousIterationLetter = letter;
        }
        segments.add(segment);
        return segments;
    }
}
