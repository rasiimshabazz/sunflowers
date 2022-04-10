package collatz;

public class StepFactory {

    public static Step create(int number) {
        if (isEven(number)) return new EvenStep(number);
        else return new OddStep(number);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
