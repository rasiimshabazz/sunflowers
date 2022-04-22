package collatz;

class EvenStep extends Step {

    EvenStep(long number) {
        super(number);
    }

    @Override
    long run() {
        return this.number / 2;
    }

}
