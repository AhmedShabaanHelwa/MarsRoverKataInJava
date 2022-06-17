class East {
    static Position moveEast(Position position) {
        position.setX(position.getX() + 1);
        return position;
    }
}