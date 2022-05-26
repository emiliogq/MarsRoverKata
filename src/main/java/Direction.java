public class Direction {
    public static final int NORTH_DIRECTION = 0;
    char[] directions = {'N', 'E', 'S', 'W'} ;
    int directionIndex = NORTH_DIRECTION;


    public void rotateRight() {
        directionIndex = (directionIndex+1) % directions.length;
    }

    public void rotateLeft() {
        directionIndex = (directionIndex-1) % directions.length;
    }

    public char getDirection() {
        return directions[directionIndex];
    }
}
