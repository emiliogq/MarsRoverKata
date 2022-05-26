public class EastDirection extends Direction {
    public EastDirection() {
        super('E');
    }

    @Override
    public Direction left() {
        return new NorthDirection();
    }

    @Override
    public Direction right() {
        return new SouthDirection();
    }

    @Override
    public void move(Position position) {
        position.right();
    }
}
