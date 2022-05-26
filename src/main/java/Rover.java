public class Rover {
    private String obstaclePrefix;
    private Direction direction;

    private Position position;

    public Rover() {
        this.direction = new NorthDirection();
        this.position = new Position(0, 0);
        this.obstaclePrefix = "";
    }

    public void rotate(char nextDirection) {
        if (nextDirection == 'R') {
            direction = direction.right();
        } else if (nextDirection == 'L') {
            direction = direction.left();
        }
    }

    void setDirection(Direction direction) {
        this.direction = direction;
    }


    public void move(Grid grid) {
        Position nextPosition = new Position(this.position);
        direction.move(nextPosition);

        if (!grid.isObstacle(nextPosition)) {
            Position wrappedAround = grid.wrapAround(nextPosition);
            if (!grid.isObstacle(wrappedAround)) {
                this.position = wrappedAround;
            } else {
                obstaclePrefix = "0:";
            }
        } else {
            obstaclePrefix = "0:";
        }

    }

    public String toString() {
        return obstaclePrefix + position.getX() + ":" + position.getY() + ":" + direction.getName();
    }
}
