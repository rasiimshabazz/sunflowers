package consecutist;

import java.util.*;
import java.util.stream.Collectors;

public class Consecutist {

    static String pruneConsecutiveCharacters(String word, int maxConsecutiveChars) {
        if (maxConsecutiveChars == 0) return "";

        List<String> segments = collectSegmentsOfRepeats(word);

        List<String> truncatedSegments = segments.stream().map(segment -> {
            if (maxConsecutiveChars > segment.length()) {
                String substring = segment.substring(0, segment.length() - 1);
                return substring;
            }
            String substring = segment.substring(0, maxConsecutiveChars);
            return substring;
        }).collect(Collectors.toList());

        String collect = truncatedSegments.stream().map((segment -> segment)).collect(Collectors.joining(""));
        return collect;

//        return word;
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
