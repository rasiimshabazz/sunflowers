package document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NoteTest {

    @Test
    void isFormable_guards() {
        assertTrue(new Note("").isFormableFrom(""));
        assertFalse(new Note("any text").isFormableFrom(""));
        assertFalse(new Note("").isFormableFrom("any document"));
    }

    @Test
    void isFormable() {
        assertTrue(new Note("scary note").isFormableFrom("a bunch of text from today's newspaper"));
        assertTrue(new Note("abc").isFormableFrom("ann bob cat"));
        assertTrue(new Note("abc abc").isFormableFrom("cann bob cat"));
    }

    @Test
    void isFormable_false() {
        assertFalse(new Note("even scarier note").isFormableFrom("a bunch of text from today's newspaper"));
        assertFalse(new Note("abc abc").isFormableFrom("abc "));
        assertFalse(new Note("abc abc").isFormableFrom("ann bob cat"));
    }

}