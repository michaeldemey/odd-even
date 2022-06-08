package best.implementation.ever;

import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class IntegerArgumentsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of(2, true),
                Arguments.of(4, true),
                Arguments.of(6, true),
                Arguments.of(0, true),
                Arguments.of(-2, true),
                Arguments.of(-10, true),
                Arguments.of(1, false),
                Arguments.of(3, false),
                Arguments.of(5, false),
                Arguments.of(7, false),
                Arguments.of(-1, false),
                Arguments.of(-13, false),
                Arguments.of(Integer.MAX_VALUE, false),
                Arguments.of(Integer.MIN_VALUE, true)
        );
    }
}
