package collatz;

public class EvenStep extends Step {

    public EvenStep(long number) {
        super(number);
    }

    @Override
    public long run() {
        return this.number / 2;
    }

}
