package com.sid.robotsimulation.model;

import java.util.Objects;

public class Position {

    private final int x;
    private final int y;
    private final int z;


    public Position(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Position left() {
        return newPosition(x - 1, y, z);
    }

    public Position right() {
        return newPosition(x + 1, y, z);
    }

    public Position up() {
        return newPosition(x, y + 1, z);
    }

    public Position down() {
        return newPosition(x, y - 1, z);
    }

    public Position forward() {
        return newPosition(x, y, z + 1);
    }

    public Position backward() {
        return newPosition(x, y, z - 1);
    }

    public Double distanceFrom(Position position) {
        double xSquared = Math.pow((position.x - x), 2);
        double ySquared = Math.pow((position.y - y), 2);
        double zSquared = Math.pow((position.z - z), 2);
        return Math.sqrt(xSquared + ySquared + zSquared);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return (x == position.x &&
                y == position.y &&
                z == position.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    private Position newPosition(int i, int j, int k) {
        return new Position(i, j, k);
    }
}
