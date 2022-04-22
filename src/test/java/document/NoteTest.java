package document;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class NoteTest {

    @Test
    void isFormable() {

        String text = "";
        String document = "";
        assertTrue(new Note().isFormable(text, document));
    }
}