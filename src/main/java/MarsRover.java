public class MarsRover {

    public String execute(String moves) {
        String position = "0:1:N";
        int forward = 0;

        for(char move : moves.toCharArray()){
            forward++;
        }
        if (forward >= 10){
            forward = 0;
        }
        position = "0:"+forward+":N";
        return position;
    }
}
