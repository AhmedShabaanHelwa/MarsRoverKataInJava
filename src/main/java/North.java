class North {
    static Position moveForward(Position position) {
        position.setY(position.getY() + 1);
        return position;
    }
}