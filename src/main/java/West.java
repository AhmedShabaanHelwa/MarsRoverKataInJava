class West {
    static Position moveWest(Position position) {
        position.setX(position.getX() - 1);
        return position;
    }
}