package collatz;

class StepFactory {

    static Step create(long number) {
        if (isEven(number)) return new EvenStep(number);
        else return new OddStep(number);
    }

    private static boolean isEven(long number) {
        return number % 2 == 0;
    }
}
