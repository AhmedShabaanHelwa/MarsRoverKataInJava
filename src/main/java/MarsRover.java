class MarsRover {

    private final String initialState;
    private Position position;

    public MarsRover(String initialState) {
        this.initialState = initialState;
        position = new Position();
    }

    public String execute(String commands) {

        String[] initialStateStrings = initialState.split(":");
        position.setX(Integer.parseInt(initialStateStrings[0]));
        position.setY(Integer.parseInt(initialStateStrings[1]));
        String direction = initialStateStrings[2];

        if (commands.equals("M")) {
            switch (direction) {
                case "N" -> position = North.moveNorth(position);
                case "E" -> position = East.moveEast(position);
                case "S" -> position = South.moveSouth(position);
                case "W" -> position = West.moveWest(position);
                default -> throw new UnsupportedOperationException("Direction " + direction + " is not supported.");
            }
        }
        return position.getX() + ":" + position.getY() + ":" + direction;
    }
}