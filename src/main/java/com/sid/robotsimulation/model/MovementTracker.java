package com.sid.robotsimulation.model;

import java.util.ArrayList;
import java.util.List;

public class MovementTracker {
    private List<Position> visited;

    public MovementTracker() {
        this.visited = new ArrayList<>();
    }

    public void add(Position position) {
        this.visited.add(position);
    }

    public List<Position> getVisited() {
        return visited;
    }
}
