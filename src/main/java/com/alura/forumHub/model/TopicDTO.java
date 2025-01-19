package com.alura.forumHub.model;

import jakarta.validation.constraints.NotBlank;

public class TopicDTO {
    @NotBlank
    private String title;

    @NotBlank
    private String message;

    @NotBlank
    private String authorName;

    @NotBlank
    private String courseName;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
