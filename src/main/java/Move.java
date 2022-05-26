public class Move implements RoverCommand {
    private Rover rover;

    public Move(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move();
    }
}
