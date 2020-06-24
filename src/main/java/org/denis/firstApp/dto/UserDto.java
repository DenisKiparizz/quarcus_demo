package org.denis.firstApp.dto;

import org.denis.firstApp.entity.Course;

public class UserDto {
    private String name;
    private Course course;

    public UserDto(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public UserDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
