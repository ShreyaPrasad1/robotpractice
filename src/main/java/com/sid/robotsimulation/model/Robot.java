package com.sid.robotsimulation.model;

public class Robot {
    private Position currentPosition;
    private final Position initialPosition;
    private MovementTracker movementTracker;

    public Robot(Position startPosition) {
        this.currentPosition = startPosition;
        this.initialPosition = startPosition;
        this.movementTracker = new MovementTracker();
        this.movementTracker.add(startPosition);
    }

    public MovementTracker getMovementTracker() {
        return movementTracker;
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    public void moveLeft() {
        this.currentPosition = this.currentPosition.left();
        this.movementTracker.add(currentPosition);
    }

    public void moveRight() {
        this.currentPosition = this.currentPosition.right();
        this.movementTracker.add(currentPosition);
    }

    public void moveUp() {
        this.currentPosition = this.currentPosition.up();
        this.movementTracker.add(currentPosition);
    }

    public void moveDown() {
        this.currentPosition = this.currentPosition.down();
        this.movementTracker.add(currentPosition);
    }


    public void moveForward() {
        this.currentPosition = this.currentPosition.forward();
        this.movementTracker.add(currentPosition);
    }

    public void moveBackward() {
        this.currentPosition = this.currentPosition.backward();
        this.movementTracker.add(currentPosition);
    }
}
