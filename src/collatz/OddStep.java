package collatz;

public class OddStep extends Step {

    public OddStep(int number) {
        super(number);
    }

    @Override
    public int run() {
        return (3 * this.number) + 1;
    }

}
