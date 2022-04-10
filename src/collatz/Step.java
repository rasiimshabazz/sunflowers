package collatz;

public abstract class Step {

    long number;

    Step(long number) {
        this.number = number;
    }

    public long runEven() {
        return this.number / 2;
    }

    public long runOdd() {
        return (3 * this.number) + 1;
    }

}
