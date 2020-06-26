package org.denis.firstApp.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@MongoEntity(collection = "users")
public class User {
    private String id;
    private String userName;
    private List<UserCourses> courses = new ArrayList<>();

    public User(String id, String userName, List<UserCourses> courses) {
        this.id = id;
        this.userName = userName;
        this.courses = courses;
    }

    public List<UserCourses> getCourses() {
        return courses;
    }

    public List<UserCourses> getCoursesByName(CoursesEnum name) {
        return courses.stream()
                .filter(course -> course.getName().toString().equalsIgnoreCase(name.toString()))
                .collect(Collectors.toList());
    }

    public void setCourses(List<UserCourses> courses) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) &&
                userName.equals(user.userName) &&
                courses.equals(user.courses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, courses);
    }
}
