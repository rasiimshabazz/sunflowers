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
            Collatz collatz = create(number);
            List<Step> steps = getSteps(collatz);
            long sequenceCount = steps.size();
            stepCounts.add(new StepCount(number, sequenceCount));
        });

        StepCount stepCount = stepCounts.stream()
                .max(Comparator.comparing(StepCount::getStepCount))
                .orElseThrow(NoSuchElementException::new);
        return stepCount.getNumber();
    }

    public static Collatz create(long number) {
        final int COLLATZ_LIMIT = 1000000;
        boolean isInbounds = !(number <= 0 || number > COLLATZ_LIMIT);
        return new Collatz(isInbounds ? number : 0);
    }

    public static List<Step> getSteps(Collatz collatz) {
        long input = collatz.number;
        List<Step> steps = new ArrayList<>();
        while (input > 1) {
            Step step = Step.create(input);
            steps.add(step);
            input = step.run();
        }
        return steps;
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
