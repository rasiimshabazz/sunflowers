package consecutist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutistTest {

    @Test
    void pruneConsecutiveCharacters_zero_returns_empty_string() {
        assertEquals("", Consecutist.pruneConsecutiveCharacters("hello", 0));
    }
}