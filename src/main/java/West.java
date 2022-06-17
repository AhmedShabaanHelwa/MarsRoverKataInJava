class West implements IDirection {
    public Position moveForward(Position position) {
        position.setX(position.getX() - 1);
        return position;
    }
}