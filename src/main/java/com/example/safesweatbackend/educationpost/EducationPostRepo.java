package com.example.safesweatbackend.educationpost;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface EducationPostRepo extends JpaRepository<EducationPost, UUID> {

    @Query("SELECT c FROM education_post_category c WHERE c.categoryId = :categoryId")
    EducationPostCategory findCategoryById(UUID categoryId);

    @Query("SELECT c FROM education_post_category c")
    List<EducationPostCategory> findAllCategories();
}
