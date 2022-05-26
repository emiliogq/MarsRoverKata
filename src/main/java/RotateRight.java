public class RotateRight implements RoverCommand {
    private Rover rover;

    public RotateRight(Rover rover) {

        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.rotate('R');
    }
}
