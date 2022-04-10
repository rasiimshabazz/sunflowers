import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollatzSequenceTest {

    @Test
    void getNumberWithMostSteps() {
        List<Integer> numbers = Arrays.stream(IntStream.range(1, 1000000).toArray())
                .boxed().collect(Collectors.toList());
        assertEquals(837799, CollatzSequence.getNumberWithMostSteps(numbers));
    }

}
