package controllers;

import com.sid.robotsimulation.model.Direction;
import com.sid.robotsimulation.model.Position;
import com.sid.robotsimulation.model.Robot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RobotControllerTest {

    Robot robot;
    RobotController robotController;

    @BeforeEach
    void setUp() {
        robot = new Robot(new Position(0,0));
        robotController = new RobotController(robot);
    }

    @Test
    public void shouldMoveTheRobotLeftNTimes(){

        robotController.moveCommand(Direction.LEFT, Direction.LEFT);

        Assertions.assertEquals(new Position(-2, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotRightNTimes(){
        robotController.moveCommand(Direction.RIGHT, Direction.RIGHT, Direction.RIGHT);

        Assertions.assertEquals(new Position(3, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotUpNTimes(){
        robotController.moveCommand(Direction.UP, Direction.UP, Direction.UP);

        Assertions.assertEquals(new Position(0, 3), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotDownNTimes(){
        robotController.moveCommand(Direction.DOWN, Direction.DOWN, Direction.DOWN);

        Assertions.assertEquals(new Position(0, -3), robot.getCurrentPosition());
    }

    @Test
    public void shouldMoveTheRobotForCommands(){
        robotController.moveCommand(Direction.DOWN, Direction.UP, Direction.LEFT, Direction.RIGHT);

        Assertions.assertEquals(new Position(0, 0), robot.getCurrentPosition());
    }

    @Test
    public void shouldGetTheInitialPositionOfRobot(){
        robotController.moveCommand(Direction.UP, Direction.DOWN);

        Assertions.assertEquals(new Position(0,0), robot.getInitialPosition());
    }

}