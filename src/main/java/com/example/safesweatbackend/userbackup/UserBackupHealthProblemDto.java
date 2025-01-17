package com.example.safesweatbackend.userbackup;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserBackupHealthProblemDto {

    private UUID userId;

    private String healthProblem;
}
