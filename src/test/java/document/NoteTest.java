package document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

class NoteTest {

    @Test
    void isFormable() {
        assertTrue(new Note().isFormable("", ""));
        assertFalse(new Note().isFormable("any text", ""));
        assertFalse(new Note().isFormable("", "any document"));
    }

}