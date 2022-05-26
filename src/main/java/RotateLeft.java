public class RotateLeft implements RoverCommand {
    private Rover rover;

    public RotateLeft(Rover rover) {
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.rotate('L');
    }
}
