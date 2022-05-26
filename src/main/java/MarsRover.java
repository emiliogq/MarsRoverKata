public class MarsRover {
    public String execute(String commands) {
        String position;
        int forward = 0;


        final char[] directions = {'N', 'E', 'S', 'W'} ;
        int directionIndex = NORTH_DIRECTION;

        final char[] commandsArray = commands.toCharArray();
        Rover rover = new Rover();

        for(char move : commandsArray){
            RoverCommand command;
            if (move == 'R') {
                 command = new RotateRight(rover);
            } else if (move == 'L') {
                command = new RotateLeft(rover);
            } else if (move == 'M'){
                command = new Move(rover);
            }
        }
        if (forward >= 10){
            forward = 0;
        }
        position = "0:"+forward+":"+directions[directionIndex];
        return position;
    }
}
