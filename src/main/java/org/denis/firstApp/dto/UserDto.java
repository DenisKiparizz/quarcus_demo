package org.denis.firstApp.dto;

import org.denis.firstApp.entity.UserCourses;
import java.util.List;

public class UserDto {
    private String name;
    private List<UserCourses> course;

    public UserDto() {
    }

    public UserDto(String name, List<UserCourses> course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserCourses> getCourse() {
        return course;
    }

    public void setCourse(List<UserCourses> course) {
        this.course = course;
    }
}
