package collatz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EvenStepTest {

    @Test
    void run() {

        assertEquals(3, new EvenStep(6).run());
    }

}
