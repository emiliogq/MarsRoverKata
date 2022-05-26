public class SouthDirection extends Direction {
    public SouthDirection() {
        super('S');
    }

    @Override
    public Direction left() {
        return new EastDirection();
    }

    @Override
    public Direction right() {
        return new WestDirection();
    }

    @Override
    public void move(Position position) {
        position.down();
    }

}
