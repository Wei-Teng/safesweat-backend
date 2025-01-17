package com.example.safesweatbackend.workoutplan;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FocusAreaDto {

    private UUID focusAreaId;

    private String name;
}
