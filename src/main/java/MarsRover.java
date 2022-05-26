import java.util.ArrayList;

public class MarsRover {
    public String execute(String commands) {
        ArrayList<RoverCommand> roverCommands = new ArrayList<>();
        final char[] commandsArray = commands.toCharArray();
        Rover rover = new Rover();

        for(char move : commandsArray){
            RoverCommand command;
            if (move == 'R') {
                 command = new RotateRight(rover);
            } else if (move == 'L') {
                command = new RotateLeft(rover);
            } else {
                command = new Move(rover);
            }
            roverCommands.add(command);
        }
        for(RoverCommand command : roverCommands){
            command.execute();
        }
        Position position = rover.getPosition();
        return position.getX()+":"+ position.getY()+":"+rover.getDirection();
    }
}
