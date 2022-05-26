public class NorthDirection extends Direction {
    public NorthDirection() {
        super('N');
    }

    @Override
    public Direction left() {
        return new WestDirection();
    }

    @Override
    public Direction right() {
        return new EastDirection();
    }

    @Override
    public void move(Position position) {
        position.up();
    }
}
