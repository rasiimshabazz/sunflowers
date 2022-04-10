package collatz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CollatzTest {

    @Test
    void getSequenceCount() {
        assertEquals(0, CollatzCreator.create(1).getSteps().size());
        assertEquals(1, CollatzCreator.create(2).getSteps().size());
        assertEquals(7, CollatzCreator.create(3).getSteps().size());
        assertEquals(0, CollatzCreator.create(-123).getSteps().size());
        assertEquals(152, CollatzCreator.create(1000000).getSteps().size());
        assertEquals(0, CollatzCreator.create(1000000 + 1).getSteps().size());
    }
}