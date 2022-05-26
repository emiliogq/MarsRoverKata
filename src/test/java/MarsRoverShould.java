import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MarsRoverShould {

    private static Stream<Arguments> moveNorthInputs() {
        return Stream.of(
                arguments("M", "0:1:N"),
                arguments("MM", "0:2:N"),
                arguments("MMM", "0:3:N"),
                arguments("MMMMMMMMMM", "0:0:N")
        );
    }
    @ParameterizedTest
    @MethodSource("moveNorthInputs")
    void moveNorth(String command, String expectedPosition) {
        MarsRover marsRover = new MarsRover();
        Assertions.assertEquals(marsRover.execute(command), expectedPosition);
    }

    private static Stream<Arguments> rotateInputs() {
        return Stream.of(
                arguments("R", "0:0:E"),
                arguments("RR", "0:0:S"),
                arguments("RRR", "0:0:W"),
                arguments("RRRR", "0:0:N"),
                arguments("RRRRR", "0:0:E"),
                arguments("L", "0:0:W"),
                arguments("LL", "0:0:S")

                );
    }
    @ParameterizedTest
    @MethodSource("rotateInputs")
    void rotate(String command, String expectedPosition) {
        MarsRover marsRover = new MarsRover();
        Assertions.assertEquals(marsRover.execute(command), expectedPosition);
    }

}
