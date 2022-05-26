import java.awt.*;

public class Rover {


    private static final int MAX_WEIGHT = 10;
    private static final int MAX_HEIGHT = 10;
    private Direction direction;
    private Position position;

    public Rover() {
        this.direction = new Direction();
        this.position = new Position(0,0);
    }

    public void rotate(char nextDirection) {
        if (nextDirection == 'R'){
            direction.rotateRight();
        }
        else if (nextDirection == 'L'){
            direction.rotateLeft();
        }
    }

    public void move() {
        int x = position.getX();
        int y = position.getY();
        char direction = this.direction.getDirection();

        if (direction == 'N'){
            y++;
        }
        else if (direction == 'E'){
            x++;
        }
        else if (direction == 'S'){
            y--;
        }
        else if (direction == 'W'){
            x--;
        }
        x = x % MAX_WEIGHT;
        y = y % MAX_HEIGHT;

        position.setX(x);
        position.setY(y);
    }

    public Position getPosition() {
        return position;
    }

    public char getDirection() {
        return direction.getDirection();
    }
}
