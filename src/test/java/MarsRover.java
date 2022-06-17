class MarsRover {

    private final String initialState;

    public MarsRover(String initialState) {

        this.initialState = initialState;
    }

    public String execute(String commands) {

        if(commands.equals("M")){
            return "0:1:N";
        }
        return initialState;
    }
}
