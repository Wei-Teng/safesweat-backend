package com.example.safesweatbackend.workoutplan;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WorkoutPlanRepo extends JpaRepository<WorkoutPlan, UUID> {

}
