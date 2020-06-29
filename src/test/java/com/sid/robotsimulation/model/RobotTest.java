package com.sid.robotsimulation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotTest {

    private Robot robot;

    @BeforeEach
    void setUp() {
        Position startPosition = new Position(0, 0, 0);
        robot = new Robot(startPosition);
    }

    @Test
    public void shouldCreateRobotWithPosition(){

        Assertions.assertEquals(new Position(0, 0, 0), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepLeft() {
        robot.moveLeft();

        Assertions.assertEquals(new Position(-1, 0, 0), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepRight() {
        robot.moveRight();

        Assertions.assertEquals(new Position(1, 0, 0), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepUp() {
        robot.moveUp();

        Assertions.assertEquals(new Position(0, 1, 0), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepDown() {
        robot.moveDown();

        Assertions.assertEquals(new Position(0, -1, 0), robot.getCurrentPosition());
    }


}