import collatz.EvenStep;
import collatz.OddStep;
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

            long input = !((long) number <= 0 || (long) number > COLLATZ_LIMIT) ? (long) number : 0;
            List<Step> steps1 = new ArrayList<>();
            while (input > 1) {
                Step step;
                if (input % 2 == 0) step = new EvenStep(input);
                else step = new OddStep(input);
                steps1.add(step);
                input = step.run();
            }
            List<Step> steps = steps1;
            long sequenceCount = steps.size();
            stepCounts.add(new StepCount(number, sequenceCount));
        });

        StepCount stepCount = stepCounts.stream()
                .max(Comparator.comparing(stepCount1 -> stepCount1.stepCount))
                .orElseThrow(NoSuchElementException::new);
        return stepCount.number;
    }

    static class StepCount {
        private long number;
        private long stepCount;

        public StepCount(long number, long stepCount) {
            this.number = number;
            this.stepCount = stepCount;
        }
    }


}
