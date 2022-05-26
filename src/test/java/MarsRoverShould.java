import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MarsRoverShould {

    private MarsRover marsRover;

    @BeforeEach
    void setUp() {
        marsRover = new MarsRover();
    }

    private static Stream<Arguments> moveNorthInputs() {
        return Stream.of(
                arguments("0:1:N", "M"),
                arguments("0:2:N", "MM"),
                arguments("0:3:N", "MMM"),
                arguments("0:0:N", "MMMMMMMMMM")
        );
    }

    @ParameterizedTest
    @MethodSource("moveNorthInputs")
    void moveUp(String expectedPosition, String command) {
        Assertions.assertEquals(expectedPosition, marsRover.execute(command));
    }

    private static Stream<Arguments> rotateRightInputs() {
        return Stream.of(
                arguments("R", "0:0:E"),
                arguments("RR", "0:0:S"),
                arguments("RRR", "0:0:W"),
                arguments("RRRR", "0:0:N"),
                arguments("RRRRR", "0:0:E")
                );
    }
    @ParameterizedTest
    @MethodSource("rotateRightInputs")
    void rotateRight(String command, String expectedPosition) {
        Assertions.assertEquals(expectedPosition, marsRover.execute(command));
    }

    private static Stream<Arguments> rotateLeftInputs() {
        return Stream.of(
                arguments("L", "0:0:W"),
                arguments("LL", "0:0:S"),
                arguments("LLL", "0:0:E"),
                arguments("LLLL", "0:0:N"),
                arguments("LLLLL", "0:0:W")

        );
    }
    @ParameterizedTest
    @MethodSource("rotateLeftInputs")
    void rotateLeft(String command, String expectedPosition) {
        Assertions.assertEquals(expectedPosition, marsRover.execute(command));
    }


}
