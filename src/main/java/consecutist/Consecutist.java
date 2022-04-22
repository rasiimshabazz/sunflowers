package consecutist;

import java.util.*;
import java.util.stream.Collectors;

class Consecutist {

    static String pruneConsecutiveCharacters(String letterSequence, int maxConsecutiveChars) {
        if (maxConsecutiveChars <= 0) return "";
        List<String> segments = collectSegmentsOfRepeats(letterSequence);
        List<String> truncatedSegments = segments.stream()
                .map(segment -> segment.length() > maxConsecutiveChars ? segment.substring(0, maxConsecutiveChars) : segment)
                .collect(Collectors.toList());
        return truncatedSegments.stream().collect(Collectors.joining());
    }

    static List<String> collectSegmentsOfRepeats(String word) {
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
