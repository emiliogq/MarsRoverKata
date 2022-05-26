import java.util.ArrayList;

public class Grid {
    int width;
    int height;
    private ArrayList<Position> obstacles;

    public Grid(int x, int height) {
        this.width = x;
        this.height = height;
        obstacles = new ArrayList<>();
    }

    public boolean isObstacle(Position position) {
        return obstacles.contains(position);
    }

    public Position wrapAround(Position position) {
        int x = position.getX();
        int y = position.getY();

        if (x < 0) {
            x = width - 1;
        } else if (x == width) {
            x = 0;
        }
        if (y < 0) {
            y = height - 1;
        } else if (y == height) {
            y = 0;
        }
        return new Position(x, y);
    }

    public void addObstacle(int x, int y) {
        obstacles.add(new Position(x, y));
    }
}
