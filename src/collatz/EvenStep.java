package collatz;

public class EvenStep extends Step {

    public EvenStep(int number) {
        super(number);
    }

    @Override
    public int run() {
        return this.number / 2;
    }

}
