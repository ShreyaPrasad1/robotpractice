package service;

import com.sid.robotsimulation.model.Position;
import com.sid.robotsimulation.model.Robot;

import java.util.List;

public class RobotService {
    public Double findDistance(Robot robotOne, Robot robotTwo) {
        Position robotOnePosition = robotOne.getCurrentPosition();
        Position robotTwoPosition = robotTwo.getCurrentPosition();
        return robotOnePosition.distanceFrom(robotTwoPosition);
    }

    public Boolean crossesPath(Robot robotOne, Robot robotTwo) {
        List<Position> robotOneVisitedPoints = robotOne.getMovementTracker().getVisited();
        List<Position> robotTwoVisitedPoints = robotTwo.getMovementTracker().getVisited();
        return robotOneVisitedPoints.stream().anyMatch(point ->
                robotTwoVisitedPoints.stream()
                        .anyMatch(point::equals)
        );
    }

}
