import collatz.CollatzCreator;
import collatz.StepCount;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CollatzSequence {

    public static long getNumberWithMostSteps(List<Integer> numbers) {
        return getMaxStepCount(getSequenceCounts(numbers)).getNumber();
    }

    private static StepCount getMaxStepCount(List<StepCount> stepCounts) {
        StepCount stepCount = stepCounts.stream()
                .max(Comparator.comparing(StepCount::getStepCount))
                .orElseThrow(NoSuchElementException::new);
        return stepCount;
    }

    private static List<StepCount> getSequenceCounts(List<Integer> numbers) {
        List<StepCount> stepCounts = new ArrayList<>();
        numbers.stream().forEach(number -> {
            int sequenceCount = CollatzCreator.create(number).getSteps().size();
            stepCounts.add(new StepCount(number, sequenceCount));
        });
        return stepCounts;
    }

}
