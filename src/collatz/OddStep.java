package collatz;

public class OddStep extends Step {

    public OddStep(long number) {
        super(number);
    }

    @Override
    public long run() {
        return (3 * this.number) + 1;
    }

}
