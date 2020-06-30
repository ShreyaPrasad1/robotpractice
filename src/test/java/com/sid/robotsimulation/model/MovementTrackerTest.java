package com.sid.robotsimulation.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class MovementTrackerTest {

    @Test
    void shouldReturnVisitedPoints() {
        MovementTracker movementTracker = new MovementTracker();
        Position positionOne = new Position(1, 1, 2);
        Position positionTwo = new Position(2, 3, 2);
        movementTracker.add(positionOne);
        movementTracker.add(positionTwo);
        List<Position> actualVisitedPoints = movementTracker.getVisited();
        Assertions.assertEquals(positionOne, actualVisitedPoints.get(0));
        Assertions.assertEquals(positionTwo, actualVisitedPoints.get(1));
    }
}
