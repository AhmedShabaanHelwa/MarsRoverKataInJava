class North {
    static Position moveNorth(Position position) {
        position.setY(position.getY() + 1);
        return position;
    }
}