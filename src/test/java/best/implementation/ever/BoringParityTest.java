package best.implementation.ever;

import best.implementation.ever.impl.DontDoItLikeThisParityChecker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

public class BoringParityTest {

    @ParameterizedTest
    @ArgumentsSource(IntegerArgumentsProvider.class)
    public void parityTest(int integer, boolean expected) {
        boolean actual = new DontDoItLikeThisParityChecker().isEven(integer);

        Assertions.assertEquals(expected, actual);
    }
}
