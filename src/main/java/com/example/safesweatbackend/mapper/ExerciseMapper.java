package com.example.safesweatbackend.mapper;

import com.example.safesweatbackend.workoutplan.ExerciseDto;
import com.example.safesweatbackend.workoutplan.Exercise;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ExerciseMapper {

    List<ExerciseDto> exercisesToDtos(List<Exercise> exercises);

}
