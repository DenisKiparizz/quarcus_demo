package org.denis.firstApp.mapper;

import org.denis.firstApp.dto.CourseDto;
import org.denis.firstApp.entity.Course;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class CourseMapper {

    public Course mapToCourse(CourseDto courseDto) {
        Course course = new Course();
        UUID uuid = UUID.randomUUID();
        course.setId(uuid.toString());
        course.setName(courseDto.getName());
        course.setDescription(courseDto.getDescription());
        return course;
    }
}
