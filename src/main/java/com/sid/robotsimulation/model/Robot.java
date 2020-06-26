package com.sid.robotsimulation.model;

public class Robot {
    private Position currentPosition;

    public Robot(Position startPosition) {
        this.currentPosition = startPosition;
    }

    public Position getCurrentPosition() {
        return this.currentPosition;
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

}