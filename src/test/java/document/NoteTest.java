package document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NoteTest {

    @Test
    void isFormable() {
        assertTrue(new Note("").isFormableGiven(""));
        assertFalse(new Note("any text").isFormableGiven(""));
        assertFalse(new Note("").isFormableGiven("any document"));
    }

}