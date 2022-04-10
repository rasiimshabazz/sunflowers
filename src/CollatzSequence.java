import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;

public class CollatzSequence {

    public static long getNumberWithMostSteps(List<Integer> numbers) {
        List<StepCount> stepCounts = new ArrayList<>();

        numbers.stream().forEach(number -> {

            long input = !((long) number <= 0 || (long) number > 1000000) ? (long) number : 0;
            int count = 0;
            while (input > 1) {
                if (input % 2 == 0) {
                    input = input / 2;
                }
                else {
                    input = (3 * input) + 1;
                }
                count++;
            }
            stepCounts.add(new StepCount(number, count));
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
