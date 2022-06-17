class MarsRover {

    private final String initialState;

    public MarsRover(String initialState) {

        this.initialState = initialState;
    }

    public String execute(String commands) {

        String[] initialStateStrings = initialState.split(":");
        int x = Integer.parseInt(initialStateStrings[0]);
        int y = Integer.parseInt(initialStateStrings[1]);
        String direction = initialStateStrings[2];

        if(commands.equals("M")){
            switch (direction){
                case "N":
                    y += 1;
                    break;
                case "E":
                    x += 1;
                    break;
                case "S":
                    y -= 1;
                    break;
                case "W":
                    x -= 1;
                    break;
            }
        }
        return x + ":" + y + ":" + direction;
    }
}
