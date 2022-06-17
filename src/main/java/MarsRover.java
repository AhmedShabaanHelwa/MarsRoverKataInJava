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
                case "N" -> {
                    direction = new North();
                    position = direction.moveForward(position);
                }
                case "E" -> {
                    direction = new East();
                    position = direction.moveForward(position);
                }
                case "S" -> {
                    direction = new South();
                    position = direction.moveForward(position);
                }
                case "W" -> {
                    direction = new West();
                    position = direction.moveForward(position);
                }
                default -> throw new UnsupportedOperationException("Direction " + direction + " is not supported.");
            }
        }
        return position.getX() + ":" + position.getY() + ":" + directionCharacter;
    }
}