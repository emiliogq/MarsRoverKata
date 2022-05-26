import static java.lang.Math.abs;

public class Direction {
    public static final int NORTH_DIRECTION = 0;
    char[] directions = {'N', 'E', 'S', 'W'} ;
    int directionIndex = NORTH_DIRECTION;


    public void rotateRight() {
        directionIndex = (directionIndex + 1) % directions.length;
    }

    public void rotateLeft() {
        int x = directionIndex-1;
        int y = directions.length;
        directionIndex = (x < 0) ? (y - (Math.abs(x) % y) ) % y : (x % y);
    }

    public char getDirection() {
        return directions[directionIndex];
    }
}
