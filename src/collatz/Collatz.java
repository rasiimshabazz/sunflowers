package collatz;

import java.util.ArrayList;
import java.util.List;

public class Collatz {

    private final int number;

    Collatz(int number) {
        this.number = number;
    }

    public List<Step> getSteps() {
        int input = this.number;
        List<Step> steps = new ArrayList<>();
        while (input > 1) {
            Step step = StepFactory.create(input);
            steps.add(step);
            input = step.run();
        }
        return steps;
    }

}
