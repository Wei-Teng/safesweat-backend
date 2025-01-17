package com.example.safesweatbackend.educationpost;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "education_post_bookmark")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EducationPostBookmark {

    @EmbeddedId
    private EducationPostBookmarkId id;

    @ManyToOne
    @MapsId("postId")
    @JoinColumn(name = "post_id")
    private EducationPost educationPost;
}