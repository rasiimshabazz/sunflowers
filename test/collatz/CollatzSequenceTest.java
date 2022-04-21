package collatz;

import collatz.CollatzSequence;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollatzSequenceTest {

    @Test
    void run() {
        assertEquals(3, CollatzSequence.getNumberWithMostSteps(Arrays.asList(1, 2, 3)));
        assertEquals(837799, CollatzSequence.getNumberWithMostSteps(allNumbersUpToAMillion()));
    }

    private List<Integer> allNumbersUpToAMillion() {
        return Arrays.stream(IntStream.range(1, 1000000).toArray()).boxed().collect(Collectors.toList());
    }

}
