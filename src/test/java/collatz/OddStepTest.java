package collatz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OddStepTest {

    @Test
    void run() {

        assertEquals(22, new OddStep(7).run());
    }

}
