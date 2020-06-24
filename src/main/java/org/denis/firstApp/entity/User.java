package org.denis.firstApp.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@MongoEntity(collection = "users")
public class User {
    private String id;
    private String userName;
    private List<Course> courses = new ArrayList<>();

    public User(String id, String userName, List<Course> courses) {
        this.id = id;
        this.userName = userName;
        this.courses = courses;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Course> getCoursesByName(String name) {
        return courses.stream()
                .filter(course -> course.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
