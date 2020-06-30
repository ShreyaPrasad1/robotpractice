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

    @BeforeEach
    void setup() {
        robotService = new RobotService();
        robotOne = new Robot(new Position(0, 0, 0));
        robotTwo = new Robot(new Position(0, 0, 0));
    }

    @Test
    void expectDistanceBetweenTwoRobotsBeZero() {
        Double distance = robotService.findDistance(robotOne, robotTwo);

        Assertions.assertEquals(Double.valueOf(0), distance);
    }

    @Test
    void shouldCalculateDistanceWithFinalPosition() {
        RobotController robotControllerOne = new RobotController(robotOne);
        robotControllerOne.moveCommand(Direction.LEFT, Direction.LEFT);
        RobotController robotControllerTwo = new RobotController(robotTwo);
        robotControllerTwo.moveCommand(Direction.RIGHT, Direction.RIGHT);
        Double distance = robotService.findDistance(robotOne, robotTwo);
        Assertions.assertEquals(Double.valueOf(4), distance);
    }

}
