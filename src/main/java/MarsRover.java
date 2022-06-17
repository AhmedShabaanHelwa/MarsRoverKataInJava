class MarsRover {
    private final String initialState;
    private Position position;
    private IDirection direction;

    MarsRover(String initialState) {
        this.initialState = initialState;
        position = new Position();
    }

    String execute(String commands) {

        String[] initialStateStrings = initialState.split(":");
        position.setX(Integer.parseInt(initialStateStrings[0]));
        position.setY(Integer.parseInt(initialStateStrings[1]));
        String directionCharacter = initialStateStrings[2];

        if (commands.equals("M")) {
            switch (directionCharacter) {
                case "N" -> direction = new North();
                case "E" -> direction = new East();
                case "S" -> direction = new South();
                case "W" -> direction = new West();
                default -> throw new UnsupportedOperationException("Direction " + direction + " is not supported.");
            }

            position = direction.moveForward(position);
        }
        return position.getX() + ":" + position.getY() + ":" + directionCharacter;
    }
}