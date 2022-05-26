public class WestDirection extends Direction {
    public WestDirection() {
        super('W');
    }

    @Override
    public Direction left() {
        return new SouthDirection();
    }

    @Override
    public Direction right() {
        return new NorthDirection();
    }

    @Override
    public void move(Position position) {
        position.left();
    }
}
