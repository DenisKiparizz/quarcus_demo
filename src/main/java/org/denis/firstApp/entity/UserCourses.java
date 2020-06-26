package org.denis.firstApp.entity;

import java.time.LocalDate;
import java.util.Objects;

public class UserCourses {
    private CoursesEnum name;
    private Integer mark;
    private LocalDate time;

    public UserCourses() {
    }

    public UserCourses(CoursesEnum name, Integer mark, LocalDate time) {
        this.name = name;
        this.mark = mark;
        this.time = time;
    }

    public CoursesEnum getName() {
        return name;
    }

    public void setName(CoursesEnum name) {
        this.name = name;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCourses that = (UserCourses) o;
        return name == that.name &&
                mark.equals(that.mark) &&
                time.equals(that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mark, time);
    }
}
