package com.example.optimization.controller;

import com.example.optimization.model.ContainerRequest;
import com.example.optimization.model.MovePlanResponse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/optimize")
public class OptimizationController {

    @PostMapping
    public MovePlanResponse optimizeContainer(@RequestBody ContainerRequest request) {
        int distance = Math.abs(request.getDestinationX() - request.getCurrentX())
                     + Math.abs(request.getDestinationY() - request.getCurrentY());

        return new MovePlanResponse(
                request.getContainerId(),
                distance,
                "Optimized Successfully"
        );
    }
}
