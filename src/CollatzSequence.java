import collatz.Collatz;
import collatz.Step;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CollatzSequence {

    public static long getNumberWithMostSteps(List<Integer> numbers) {
        List<StepCount> stepCounts = new ArrayList<>();

        numbers.stream().forEach(number -> {
            final int COLLATZ_LIMIT = 1000000;
            boolean isInbounds = !((long) number <= 0 || (long) number > COLLATZ_LIMIT);
            Collatz collatz = new Collatz(isInbounds ? (long) number : 0);

            long input = collatz.number;
            List<Step> steps1 = new ArrayList<>();
            while (input > 1) {
                Step step = Step.create(input);
                steps1.add(step);
                input = step.run();
            }
            List<Step> steps = steps1;
            long sequenceCount = steps.size();
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
