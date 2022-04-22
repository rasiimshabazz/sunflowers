package collatz;

class CollatzCreator {
    static Collatz create(long number) {
        final int COLLATZ_LIMIT = 1000000;
        boolean isInbounds = !(number <= 0 || number > COLLATZ_LIMIT);
        return new Collatz(isInbounds ? number : 0);
    }
}
