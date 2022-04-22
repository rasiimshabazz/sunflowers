package collatz;

public abstract class Step {

    long number;

    Step(long number) {
        this.number = number;
    }

    public abstract long run();

}
