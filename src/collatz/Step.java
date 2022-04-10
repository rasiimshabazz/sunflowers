package collatz;

public class Step {

    long number;

    public Step(long number) {
        this.number = number;
    }

    public long runEven() {
        return this.number / 2;
    }

    public long runOdd() {
        return (3 * this.number) + 1;
    }

}
