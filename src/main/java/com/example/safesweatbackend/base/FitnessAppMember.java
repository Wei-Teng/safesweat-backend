package com.example.safesweatbackend.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FitnessAppMember {

        private UUID memberId;

        private String name;

        private String email;

        private String phoneNumber;

        private String gender;

        private double height;

        private double weight;
}
