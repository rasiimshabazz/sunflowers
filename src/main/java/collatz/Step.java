package collatz;

abstract class Step {

    long number;

    Step(long number) {
        this.number = number;
    }

    abstract long run();

}
