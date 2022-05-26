public class Move implements RoverCommand {
    private Grid grid;
    private Rover rover;

    public Move(Grid grid, Rover rover) {
        this.grid = grid;
        this.rover = rover;
    }

    @Override
    public void execute() {
        rover.move(grid);
    }
}
