package com.sid.robotsimulation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotTest {

    private Robot robot;

    @BeforeEach
    void setUp() {
        robot = new Robot(positionObject(0, 0));
    }

    @Test
    public void shouldCreateRobotWithPosition(){

        Assertions.assertEquals(positionObject(0, 0), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepLeft() {
        robot.moveLeft();

        Assertions.assertEquals(positionObject(-1, 0), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepRight() {
        robot.moveRight();

        Assertions.assertEquals(positionObject(1, 0), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepUp() {
        robot.moveUp();

        Assertions.assertEquals(positionObject(0, 1), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepDown() {
        robot.moveDown();

        Assertions.assertEquals(positionObject(0, -1), robot.getCurrentPosition());
    }

    private static Position positionObject(int i, int i2) {
        return new Position(i, i2);
    }


}