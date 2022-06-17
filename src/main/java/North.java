class North implements IDirection {
     @Override
     public Position moveForward(Position position) {
        position.setY(position.getY() + 1);
        return position;
    }
}