package org.denis.firstApp.dto;

import org.denis.firstApp.entity.CoursesEnum;

public class CourseDto {
    private CoursesEnum name;
    private String description;

    public CourseDto(CoursesEnum name, String description) {

        this.name = name;
        this.description = description;
    }

    public CourseDto() {
    }

    public CoursesEnum getName() {
        return name;
    }

    public void setName(CoursesEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
