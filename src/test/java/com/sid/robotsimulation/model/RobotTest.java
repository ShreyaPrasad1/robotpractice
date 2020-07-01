package com.sid.robotsimulation.model;

import controllers.RobotController;
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
    void shouldCreateRobotWithPosition(){

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

    @Test
    void shouldMoveOneStepForward() {
        robot.moveForward();

        Assertions.assertEquals(new Position(0, 0, 1), robot.getCurrentPosition());
    }

    @Test
    void shouldMoveOneStepBackward() {
        robot.moveBackward();

        Assertions.assertEquals(new Position(0, 0, -1), robot.getCurrentPosition());
    }

    @Test
    void shouldFindDistanceBetweenTwoRobots() {
        Robot robotTwo = new Robot(new Position(2, 0, 0));
        Double distance = robot.getDistance(robotTwo);

        Assertions.assertEquals(Double.valueOf(2), distance);
    }

    @Test
    void shouldReturnTrueWhenRobotHasCrossedPathWithOtherRobot() {
        Robot otherRobot = new Robot(new Position(1, 0, 0));
        RobotController robotController = new RobotController(otherRobot);
        robotController.moveCommand(Direction.LEFT, Direction.LEFT);

        Boolean hasCrossedPath = robot.hasCrossedPath(otherRobot);

        Assertions.assertTrue(hasCrossedPath);
    }

    @Test
    void shouldReturnFalseWhenRobotHasNotCrossedPathWithOtherRobot() {
        Robot otherRobot = new Robot(new Position(1, 0, 0));
        RobotController robotController = new RobotController(otherRobot);
        robotController.moveCommand(Direction.RIGHT, Direction.LEFT);

        Boolean hasCrossedPath = robot.hasCrossedPath(otherRobot);

        Assertions.assertFalse(hasCrossedPath);
    }
}