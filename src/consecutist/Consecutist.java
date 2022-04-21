package consecutist;

import java.util.*;
import java.util.stream.Collectors;

public class Consecutist {

    static String pruneConsecutiveCharacters(String letterSequnce, int maxConsecutiveChars) {
        if (maxConsecutiveChars == 0) return "";
        List<String> segments = collectSegmentsOfRepeats(letterSequnce);
        List<String> truncatedSegments = segments.stream().map(segment -> {
            if (maxConsecutiveChars > segment.length()) {
                String substring = segment.substring(0, segment.length());
                return substring;
            }
            String substring = segment.substring(0, maxConsecutiveChars);
            return substring;
        }).collect(Collectors.toList());
        return truncatedSegments.stream().collect(Collectors.joining());
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
