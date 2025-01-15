package com.example.safesweatbackend.model.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExerciseDto {

    private UUID exerciseId;

    private String name;

    private String exerciseKey;
}
