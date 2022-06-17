class South {
    static Position moveSouth(Position position) {
        position.setY(position.getY() - 1);
        return position;
    }
}