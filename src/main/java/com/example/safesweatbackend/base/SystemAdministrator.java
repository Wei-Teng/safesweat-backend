package com.example.safesweatbackend.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SystemAdministrator {

        private UUID adminId;

        private String name;

        private String email;

        private String phoneNumber;

        private String role;
}
