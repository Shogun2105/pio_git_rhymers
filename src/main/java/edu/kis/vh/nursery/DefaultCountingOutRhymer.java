package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int INT = 12;
    private final int INT1 = -1;
    private int[] numbers = new int[INT];

    private int total = INT1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INT1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return INT1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return INT1;
        return numbers[total--];
    }

}
