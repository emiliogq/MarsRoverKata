public class MarsRover {

    public String execute(String commands) {
        String position;
        int forward = 0;
        char direction = 'N';

        final char[] commandsArray = commands.toCharArray();
        for(char move : commandsArray){
            if (move == 'R') {
                direction = 'E';
            } else {
                forward++;
            }
        }
        if (forward >= 10){
            forward = 0;
        }
        position = "0:"+forward+":"+direction;
        return position;
    }
}
