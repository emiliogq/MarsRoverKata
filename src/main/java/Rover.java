import java.awt.*;

public class Rover {


    private Direction direction;
    private Position position;

    public Rover() {

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
            x++;
        }
        else if (direction == 'E'){
            y++;
        }
        else if (direction == 'S'){
            x--;
        }
        else {
            y--;
        }

        position.setX(x);
        position.setY(y);
    }
}
