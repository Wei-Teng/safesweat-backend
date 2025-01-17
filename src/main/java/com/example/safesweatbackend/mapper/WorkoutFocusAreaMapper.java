package com.example.safesweatbackend.mapper;

import com.example.safesweatbackend.workoutplan.FocusAreaDto;
import com.example.safesweatbackend.workoutplan.FocusArea;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface WorkoutFocusAreaMapper {

    List<FocusAreaDto> focusAreasToDtos(List<FocusArea> focusAreas);

    FocusAreaDto focusAreaToDto(FocusArea focusArea);
}
