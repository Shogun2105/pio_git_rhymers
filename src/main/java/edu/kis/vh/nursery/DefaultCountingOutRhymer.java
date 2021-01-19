package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int INT = 12;
    private final int INT1 = -1;
    private int[] numbers = new int[INT];

    private int total = INT1;

    public void countIn(int in) {
        if (!isFull())
            numbers[total = getTotal() + 1] = in;
    }

    public boolean callCheck() {
        return getTotal() == INT1;
    }

    public boolean isFull() {
        return getTotal() == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return INT1;
        return numbers[total = getTotal() - 1];
    }

    public int getTotal() {
        return total;
    }
}
