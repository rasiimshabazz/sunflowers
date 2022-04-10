package collatz;

public abstract class Step {

    int number;

    Step(int number) {
        this.number = number;
    }

    public abstract int run();

}
