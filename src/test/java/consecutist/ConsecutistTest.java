package consecutist;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutistTest {

    @Test
    void pruneConsecutiveCharacters() {
        assertEquals("", Consecutist.pruneConsecutiveCharacters("hello", 0));
        assertEquals("", Consecutist.pruneConsecutiveCharacters("hhhelloooll", 0));
        assertEquals("abca", Consecutist.pruneConsecutiveCharacters("aaabbbccaaaaaaa", 1));
        assertEquals("aabbcc", Consecutist.pruneConsecutiveCharacters("aaabbbcc", 2));
        assertEquals("abbcc", Consecutist.pruneConsecutiveCharacters("abbbccc", 2));
        assertEquals("helol", Consecutist.pruneConsecutiveCharacters("helloooll", 1));
        assertEquals("hellool", Consecutist.pruneConsecutiveCharacters("helloool", 2));
        assertEquals("aabbccaa", Consecutist.pruneConsecutiveCharacters("aaabbbccaaaaaaa", 2));
        assertEquals("aaabbbccaaa", Consecutist.pruneConsecutiveCharacters("aaabbbccaaaaaaa", 3));
        assertEquals("aaabbbccaaaaaaa", Consecutist.pruneConsecutiveCharacters("aaabbbccaaaaaaa", 1111111));
        assertEquals("", Consecutist.pruneConsecutiveCharacters("aaabbbccaaaaaaa", -1));
    }

    @Test
    void collectSegmentsOfRepeats() {
        assertEquals(Arrays.asList("hhh", "e", "ll", "ooo", "ll"), Consecutist.collectSegmentsOfRepeats("hhhelloooll"));
        assertEquals(Arrays.asList("h", "e", "ll", "ooo", "ll"), Consecutist.collectSegmentsOfRepeats("helloooll"));
        assertEquals(Arrays.asList("h", "e", "ll", "ooo", "l"), Consecutist.collectSegmentsOfRepeats("helloool"));
        assertEquals(Arrays.asList("aaa", "bbb", "cc", "aaaaaaa"), Consecutist.collectSegmentsOfRepeats("aaabbbccaaaaaaa"));
    }

}