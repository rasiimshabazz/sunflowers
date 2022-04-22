package document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NoteTest {

    @Test
    void isFormableFrom_blanks() {
        assertTrue(new Note("").isFormableFrom(""));
        assertFalse(new Note("any text").isFormableFrom(""));
        assertTrue(new Note("").isFormableFrom("any document"));
    }

    @Test
    void isFormableFrom_nulls() {
        assertTrue(new Note(null).isFormableFrom(null));
        assertFalse(new Note("any text").isFormableFrom(null));
        assertTrue(new Note(null).isFormableFrom("any document"));
    }

    @Test
    void isFormable_trues() {
        assertTrue(new Note("scary note").isFormableFrom("a bunch of text from today's newspaper"));
        assertTrue(new Note("abc").isFormableFrom("ann bob cat"));
        assertTrue(new Note("abc abc").isFormableFrom("cann bob cat"));
        assertTrue(new Note(" 7777777").isFormableFrom(" 77777 77"));
    }

    @Test
    void isFormableFrom_case_insensitive() {
        assertTrue(new Note("SCARY NOTE").isFormableFrom("a bunch of text from today's newspaper"));
    }

    @Test
    void isFormableFrom_falses() {
        assertFalse(new Note("even scarier note").isFormableFrom("a bunch of text from today's newspaper"));
        assertFalse(new Note("abc abc").isFormableFrom("abc "));
        assertFalse(new Note("abc abc").isFormableFrom("ann bob cat"));
        assertFalse(new Note("z").isFormableFrom("a"));
        assertFalse(new Note(" 7777777").isFormableFrom(" 777777"));
    }

}