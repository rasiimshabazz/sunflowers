package collatz;

public class StepCount {
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