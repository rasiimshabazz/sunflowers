package collatz;

import java.util.ArrayList;
import java.util.List;

class Collatz {

    private final long number;

    Collatz(long number) {
        this.number = number;
    }

    List<Step> getSteps() {
        long input = this.number;
        List<Step> steps = new ArrayList<>();
        while (input > 1) {
            Step step = StepFactory.create(input);
            steps.add(step);
            input = step.run();
        }
        return steps;
    }

}
