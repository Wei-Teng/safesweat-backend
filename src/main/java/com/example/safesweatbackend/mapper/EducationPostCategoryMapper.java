package com.example.safesweatbackend.mapper;

import com.example.safesweatbackend.educationpost.EducationPostCategoryDto;
import com.example.safesweatbackend.educationpost.EducationPostCategory;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EducationPostCategoryMapper {

    List<EducationPostCategoryDto> educationPostCategoriesToDtos(List<EducationPostCategory> educationCategories);

    EducationPostCategoryDto educationPostCategoryToDto(EducationPostCategory educationCategory);
}
