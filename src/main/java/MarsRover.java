import java.util.ArrayList;

public class MarsRover {
    private static final int MAX_WIDTH = 10;
    private static final int MAX_HEIGHT = 10;
    private final Grid grid;
    private final Rover rover;

    public MarsRover() {
        grid = new Grid(MAX_WIDTH, MAX_HEIGHT);
        rover = new Rover();
    }

    public void addObstacle(int x, int y) {
        grid.addObstacle(x, y);
    }

    public String execute(String commands) {
        ArrayList<RoverCommand> roverCommands = new ArrayList<>();

        buildCommands(commands, roverCommands);

        for(RoverCommand command : roverCommands){
            command.execute();
        }

        return rover.toString();
    }

    private void buildCommands(String commands, ArrayList<RoverCommand> roverCommands) {
        final char[] commandsArray = commands.toCharArray();
        for(char move : commandsArray){
            RoverCommand command;
            if (move == 'R') {
                 command = new RotateRight(rover);
            } else if (move == 'L') {
                command = new RotateLeft(rover);
            } else {
                command = new Move(grid, rover);
            }
            roverCommands.add(command);
        }
    }
}
