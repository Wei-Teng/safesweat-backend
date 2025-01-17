package com.example.safesweatbackend.base;

import com.example.safesweatbackend.workoutplan.ExerciseDto;
import com.example.safesweatbackend.workoutplan.WorkoutPlanDto;

import java.util.List;
import java.util.UUID;

public interface WorkoutPlanService {

    WorkoutPlanDto create(WorkoutPlanDto workoutPlanDto);

    WorkoutPlanDto get(UUID id);

    List<WorkoutPlanDto> getAll();

    WorkoutPlanDto update(WorkoutPlanDto workoutPlanDto);

    void delete(UUID id);

    List<ExerciseDto> getAllExercises();
}
