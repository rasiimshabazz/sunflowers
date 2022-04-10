package collatz;

import java.util.ArrayList;
import java.util.List;

public class Collatz {

    private final long number;

    Collatz(long number) {
        this.number = number;
    }

    public static Collatz create(long number) {
        final int COLLATZ_LIMIT = 1000000;
        boolean isInbounds = !(number <= 0 || number > COLLATZ_LIMIT);
        return new Collatz(isInbounds ? number : 0);
    }

    public List<Step> getSteps() {
        long input = this.number;
        List<Step> steps = new ArrayList<>();
        while (input > 1) {
            Step step = Step.create(input);
            steps.add(step);
            input = step.run();
        }
        return steps;
    }

}
