package collatz;

public abstract class Step {

    long number;

    Step(long number) {
        this.number = number;
    }

    public static Step create(long number) {
        if (Step.isEven(number)) return new EvenStep(number);
        else return new OddStep(number);
    }

    private static boolean isEven(long number) {
        return number % 2 == 0;
    }

    public abstract long run();

}
