package com.example.safesweatbackend.educationpost;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EducationPostBookmarkDto {

    private UUID postId;

    private UUID userId;
}
