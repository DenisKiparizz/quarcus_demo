package org.denis.firstApp.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import java.util.Objects;

@MongoEntity(collection = "courses")
public class Course {
    private String id;
    private CoursesEnum name;
    private String description;

    public Course() {
    }

    public Course(String id, CoursesEnum name, String description) {
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoursesEnum getName() {
        return name;
    }

    public void setName(CoursesEnum name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id.equals(course.id) &&
                name.equals(course.name) &&
                description.equals(course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }
}

