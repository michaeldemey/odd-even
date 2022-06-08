package best.implementation.ever.impl;

import best.implementation.ever.IParityChecker;

/**
 * HOW BORING IS THIS?
 *
 * Like seriously. You should try to think outside the box!
 */
public class DontDoItLikeThisParityChecker implements IParityChecker {
    @Override
    public boolean isEven(int number) {
        return number % 2 == 0;
    }
}
