import static java.lang.Math.abs;

public abstract class Direction {
    private char name;

    public Direction(char name) {
        this.name = name;
    }

    public abstract Direction left();
    public abstract Direction right();

    public abstract void move(Position position);

    public char getName(){
        return name;
    }
}
