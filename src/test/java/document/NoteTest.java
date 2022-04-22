package document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NoteTest {

    @Test
    void isFormable() {
        assertTrue(new Note("").isFormableFrom(""));
        assertFalse(new Note("any text").isFormableFrom(""));
        assertFalse(new Note("").isFormableFrom("any document"));
    }

}