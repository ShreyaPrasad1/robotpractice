package service;

import com.sid.robotsimulation.model.Position;
import com.sid.robotsimulation.model.Robot;

public class RobotService {
    public Double findDistance(Robot robotOne, Robot robotTwo) {
        Position robotOnePosition = robotOne.getCurrentPosition();
        Position robotTwoPosition = robotTwo.getCurrentPosition();
        return robotOnePosition.distanceFrom(robotTwoPosition);
    }

}
