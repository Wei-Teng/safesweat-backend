package com.example.safesweatbackend.userbackup;

import com.example.safesweatbackend.base.type.DifficultyType;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBackupWorkoutHistoryDto {

    private UUID userId;

    private String timestamp;

    private String workoutKey;

    private Double rating;

    private Double multiplier;

    private String type;

    private String titleEn;

    private String titleMs;

    private String imageUrl;

    private DifficultyType difficulty;

    private Double caloriesBurned;

    private Double timeTaken;
}
