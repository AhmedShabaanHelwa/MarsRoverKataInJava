class MarsRover {

    private final String initialState;
    private final Position position;

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
                case "N" -> position.setY(position.getY() + 1);
                case "E" -> position.setX(position.getX() + 1);
                case "S" -> position.setY(position.getY() - 1);
                case "W" -> position.setX(position.getX() - 1);
                default -> throw new UnsupportedOperationException("Direction " + direction + " is not supported.");
            }
        }
        return position.getX() + ":" + position.getY() + ":" + direction;
    }
}
