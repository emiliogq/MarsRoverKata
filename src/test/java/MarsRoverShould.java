import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverShould {
    @Test
    void moveOneSpaceNorth() {
        MarsRover marsRover = new MarsRover();
        Assertions.assertEquals(marsRover.execute("M"), "0:1:N");
    }

    @Test
    void moveTwoSpacesNorth() {
        MarsRover marsRover = new MarsRover();
        Assertions.assertEquals(marsRover.execute("MM"), "0:2:N");
    }
}
