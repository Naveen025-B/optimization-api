package com.example.optimization.model;

public class MovePlanResponse {
    private String containerId;
    private int movesRequired;
    private String status;

    public MovePlanResponse(String containerId, int movesRequired, String status) {
        this.containerId = containerId;
        this.movesRequired = movesRequired;
        this.status = status;
    }

    // Getters and Setters
}
