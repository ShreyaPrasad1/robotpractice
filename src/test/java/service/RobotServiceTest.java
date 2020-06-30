package service;

import com.sid.robotsimulation.model.Direction;
import com.sid.robotsimulation.model.Position;
import com.sid.robotsimulation.model.Robot;
import controllers.RobotController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotServiceTest {
    private RobotService robotService;
    private Robot robotOne;
    private Robot robotTwo;
    private RobotController robotControllerOne;
    private RobotController robotControllerTwo;

    @BeforeEach
    void setup() {
        robotService = new RobotService();
        robotOne = new Robot(new Position(0, 0, 0));
        robotTwo = new Robot(new Position(0, 0, 0));
        robotControllerOne = new RobotController(robotOne);
        robotControllerOne.moveCommand(Direction.LEFT, Direction.LEFT);
        robotControllerTwo = new RobotController(robotTwo);
        robotControllerTwo.moveCommand(Direction.RIGHT, Direction.RIGHT);
    }

    @Test
    void shouldCalculateDistanceWithFinalPosition() {
        Double distance = robotService.findDistance(robotOne, robotTwo);

        Assertions.assertEquals(Double.valueOf(4), distance);
    }

    @Test
    void shouldReturnFalseIfTwoRobotsDontCrossEachOther() {
        robotTwo = new Robot(new Position(1, 0, 0));
        Boolean actual = robotService.crossesPath(robotOne, robotTwo);

        Assertions.assertEquals(false, actual);
    }

    @Test
    void shouldReturnTrueIfTwoRobotsCrossEachOther() {
        robotControllerOne.moveCommand(Direction.LEFT, Direction.RIGHT, Direction.RIGHT);
        Boolean actual = robotService.crossesPath(robotOne, robotTwo);

        Assertions.assertEquals(true, actual);
    }
}
