package collatz;

class StepCount {
    private int number;
    private int stepCount;

    public StepCount(int number, int stepCount) {
        this.number = number;
        this.stepCount = stepCount;
    }

    public int getStepCount() {
        return stepCount;
    }

    public int getNumber() {
        return number;
    }
}