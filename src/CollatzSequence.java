import collatz.Step;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CollatzSequence {

    public static long getNumberWithMostSteps(List<Integer> numbers) {
        List<StepCount> stepCounts = new ArrayList<>();

        numbers.stream().forEach(number -> {

            long input = !((long) number <= 0 || (long) number > 1000000) ? (long) number : 0;
            List<Step> steps1 = new ArrayList<>();
            while (input > 1) {
                if (input % 2 == 0) {
                    Step step = new Step(input);
                    steps1.add(step);
                    input = step.runEven();
                }
                else {
                    Step step = new Step(input);
                    steps1.add(step);
                    input = step.runOdd();
                }
            }
            stepCounts.add(new StepCount(number, steps1.size()));
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
