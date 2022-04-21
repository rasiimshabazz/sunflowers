package consecutist;


import java.util.*;

public class Consecutist {

    static String pruneConsecutiveCharacters(String input, int maxConsecutiveChars) {
        if (maxConsecutiveChars == 0) return "";
        return input;
    }


    public static Map<Character, Integer> countLetters(String hello, int i) {
        List<Character> letters = new ArrayList(Arrays.asList(hello.toCharArray()));
        Map<Character, Integer> lettersCounts = new HashMap<>();
        letters.stream().forEach(letter -> {
            int count = lettersCounts.get(letter);
            lettersCounts.put(letter, count++);
        });
        return lettersCounts;
    }
}
