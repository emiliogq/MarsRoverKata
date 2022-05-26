public class MarsRover {

    public static final int NORTH_DIRECTION = 0;

    public String execute(String commands) {
        String position;
        int forward = 0;

        final char[] directions = {'N', 'E', 'S', 'W'} ;
        int directionIndex = NORTH_DIRECTION;

        final char[] commandsArray = commands.toCharArray();

        for(char move : commandsArray){
            if (move == 'R') {
                directionIndex = (directionIndex + 1) % directions.length;
            } else if (move == 'L') {
                directionIndex -= 1;
                directionIndex = directionIndex == -1 ? directions.length - 1 : directionIndex;
            } else {
                forward++;
            }
        }
        if (forward >= 10){
            forward = 0;
        }
        position = "0:"+forward+":"+directions[directionIndex];
        return position;
    }
}
