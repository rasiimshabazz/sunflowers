package collatz;

class OddStep extends Step {

    OddStep(long number) {
        super(number);
    }

    @Override
    long run() {
        return (3 * this.number) + 1;
    }

}
