package best.implementation.ever;

/**
 * Interface to offer a generic way of checking the parity of a number.
 */
public interface IParityChecker {

    /**
     * Returns true if the number is even, false if the number is odd.
     *
     * @param number the int value tovalidate the parity
     * @return true for even, false for odd numbers
     */
    boolean isEven(final int number);
}
