import collatz.Collatz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CollatzSequence {

    public static long getNumberWithMostSteps(List<Integer> numbers) {
        List<StepCount> stepCounts = new ArrayList<>();
        numbers.stream().forEach(number -> {
            long sequenceCount = Collatz.create(number).getSteps().size();
            stepCounts.add(new StepCount(number, sequenceCount));
        });
        StepCount stepCount = stepCounts.stream()
                .max(Comparator.comparing(StepCount::getStepCount))
                .orElseThrow(NoSuchElementException::new);
        return stepCount.getNumber();
    }

    static class StepCount {
        private long number;
        private long stepCount;

        public StepCount(long number, long stepCount) {
            this.number = number;
            this.stepCount = stepCount;
        }

        public long getStepCount() {
            return stepCount;
        }

        public long getNumber() {
            return number;
        }
    }
}
