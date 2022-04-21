package consecutist;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutistTest {

    @Test
    void pruneConsecutiveCharacters() {
        assertEquals("", Consecutist.pruneConsecutiveCharacters("hello", 0));
    }

    @Test
    void countLetters() {
        Map<Character, Integer> lettersCounts = new HashMap<>();
        lettersCounts.put('h', 1);
        lettersCounts.put('e', 1);
        lettersCounts.put('l', 2);
        lettersCounts.put('o', 1);
        assertEquals(lettersCounts, Consecutist.countLetters("hello"));
    }
}