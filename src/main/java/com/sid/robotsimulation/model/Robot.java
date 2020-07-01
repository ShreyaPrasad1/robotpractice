package com.sid.robotsimulation.model;

import java.util.ArrayList;
import java.util.List;

public class Robot {
    private Position currentPosition;
    private final Position initialPosition;
    private List<Position> visited;

    public Robot(Position startPosition) {
        this.currentPosition = startPosition;
        this.initialPosition = startPosition;
        this.visited = new ArrayList<>();
        this.visited.add(initialPosition);
    }

    public Boolean hasCrossedPath(Robot otherRobot) {
        return visited.stream().anyMatch(point ->
                otherRobot.visited.stream()
                        .anyMatch(point::equals)
        );
    }

    public Double getDistance(Robot otherRobot) {
        return currentPosition.distanceFrom(otherRobot.currentPosition);
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    public void moveLeft() {
        this.currentPosition = this.currentPosition.left();
        this.visited.add(currentPosition);
    }

    public void moveRight() {
        this.currentPosition = this.currentPosition.right();
        this.visited.add(currentPosition);
    }

    public void moveUp() {
        this.currentPosition = this.currentPosition.up();
        this.visited.add(currentPosition);
    }

    public void moveDown() {
        this.currentPosition = this.currentPosition.down();
        this.visited.add(currentPosition);
    }


    public void moveForward() {
        this.currentPosition = this.currentPosition.forward();
        this.visited.add(currentPosition);
    }

    public void moveBackward() {
        this.currentPosition = this.currentPosition.backward();
        this.visited.add(currentPosition);
    }
}
