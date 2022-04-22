package collatz;

class StepCount {
    private long number;
    private long stepCount;

    StepCount(long number, long stepCount) {
        this.number = number;
        this.stepCount = stepCount;
    }

    long getStepCount() {
        return stepCount;
    }

    long getNumber() {
        return number;
    }
}