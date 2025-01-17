package com.example.safesweatbackend.base;

import com.example.safesweatbackend.educationpost.EducationPostCategoryDto;
import com.example.safesweatbackend.educationpost.EducationPostDto;

import java.util.List;
import java.util.UUID;

public interface EducationPostService {

    EducationPostDto create(EducationPostDto educationPostDTO);

    EducationPostDto get(UUID id);

    List<EducationPostDto> getAll();

    EducationPostDto update(EducationPostDto educationPostDTO);

    void delete(UUID id);

    List<EducationPostCategoryDto> getAllCategories();
}
