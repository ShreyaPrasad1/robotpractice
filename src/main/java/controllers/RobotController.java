package controllers;

import com.sid.robotsimulation.model.Direction;
import com.sid.robotsimulation.model.Robot;

public class RobotController {

    private final Robot robot;

    public RobotController(Robot robot) {
        this.robot = robot;
    }

    //TODO map instead of switch
    public void moveCommand(Direction... directions) {
        for (Direction direction: directions) {
            switch (direction) {
                case UP: robot.moveUp() ; break;
                case DOWN: robot.moveDown();break;
                case LEFT: robot.moveLeft(); break;
                case RIGHT: robot.moveRight(); break;
                case FORWARD:robot.moveForward(); break;
                case BACKWARD:robot.moveBackward(); break;
            }
        }
    }
}
