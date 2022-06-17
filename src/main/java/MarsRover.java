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
                case "N" -> position = moveNorth();
                case "E" -> position = moveEast(position);
                case "S" -> position = moveSouth(position);
                case "W" -> position = moveWest(position);
                default -> throw new UnsupportedOperationException("Direction " + direction + " is not supported.");
            }
        }
        return position.getX() + ":" + position.getY() + ":" + direction;
    }

    private Position moveWest(Position position) {
        position.setX(position.getX() - 1);
        return position;
    }

    private Position moveSouth(Position position) {
        position.setY(position.getY() - 1);
        return position;
    }

    private Position moveEast(Position position) {
        position.setX(position.getX() + 1);
        return position;
    }

    private Position moveNorth() {
        position.setY(position.getY() + 1);
        return position;
    }
}
