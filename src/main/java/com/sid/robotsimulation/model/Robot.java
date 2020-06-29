package com.sid.robotsimulation.model;

public class Robot {
    private Position currentPosition;
    private final Position initialPosition;

    public Robot(Position startPosition) {
        this.currentPosition = startPosition;
        this.initialPosition = startPosition;
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
    }

    public Position getInitialPosition() {
        return initialPosition;
    }

    public void moveLeft() {
        this.currentPosition = this.currentPosition.left();
    }

    public void moveRight() {
        this.currentPosition = this.currentPosition.right();
    }

    public void moveUp() {
        this.currentPosition = this.currentPosition.up();
    }

    public void moveDown() {
        this.currentPosition = this.currentPosition.down();
    }


    public void moveForward() {
        this.currentPosition = this.currentPosition.forward();
    }

    public void moveBackward() {
        this.currentPosition = this.currentPosition.backward();
    }
}