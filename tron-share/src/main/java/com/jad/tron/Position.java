package com.jad.tron;

public record Position(int x, int y) {
    public Position getFrontPosition(final Direction direction) {
        return switch (direction) {
            case Direction.UP -> new Position(this.x, this.y - 1);
            case Direction.DOWN -> new Position(this.x, this.y + 1);
            case Direction.LEFT -> new Position(this.x - 1, this.y);
            case Direction.RIGHT -> new Position(this.x + 1, this.y);
        };
    }

    public Position getLeftPosition(final Direction direction) {
        return switch (direction) {
            case Direction.UP -> new Position(this.x - 1, this.y);
            case Direction.DOWN -> new Position(this.x + 1, this.y);
            case Direction.LEFT -> new Position(this.x, this.y + 1);
            case Direction.RIGHT -> new Position(this.x, this.y - 1);
        };
    }

    public Position getRightPosition(final Direction direction) {
        return switch (direction) {
            case Direction.UP -> new Position(this.x + 1, this.y);
            case Direction.DOWN -> new Position(this.x - 1, this.y);
            case Direction.LEFT -> new Position(this.x, this.y - 1);
            case Direction.RIGHT -> new Position(this.x, this.y + 1);
        };
    }
}
