package consecutist;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutistTest {

    @Test
    void pruneConsecutiveCharacters() {
        assertEquals("", Consecutist.pruneConsecutiveCharacters("hello", 0));
    }

    @Test
    void collectSegmentsOfRepeats() {
        assertEquals(Arrays.asList("hhh", "e", "ll", "ooo", "ll"), Consecutist.collectSegmentsOfRepeats("hhhelloooll"));
        assertEquals(Arrays.asList("h", "e", "ll", "ooo", "ll"), Consecutist.collectSegmentsOfRepeats("helloooll"));
        assertEquals(Arrays.asList("h", "e", "ll", "ooo", "l"), Consecutist.collectSegmentsOfRepeats("helloool"));
        assertEquals(Arrays.asList("aaa", "bbb", "cc", "aaaaaaa"), Consecutist.collectSegmentsOfRepeats("aaabbbccaaaaaaa"));
    }

    @Test
    void countLetters() {
        Map<Character, Integer> lettersCounts = new HashMap<>();
        lettersCounts.put('h', 1);
        lettersCounts.put('e', 1);
        lettersCounts.put('l', 3);
        lettersCounts.put('o', 3);
        assertEquals(lettersCounts, Consecutist.countLetters("helloool"));
    }

}