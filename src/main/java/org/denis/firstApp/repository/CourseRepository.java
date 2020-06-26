package org.denis.firstApp.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import org.denis.firstApp.dto.CourseDto;
import org.denis.firstApp.entity.Course;
import org.denis.firstApp.mapper.CourseMapper;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CourseRepository implements PanacheMongoRepositoryBase<Course, String> {

    @Inject
    CourseMapper courseMapper;

    public List<Course> getAllCourses() {
        return findAll().list();
    }

    public void save(CourseDto courseDto) {
        persist(courseMapper.mapToCourse(courseDto));
    }

    public Course updateCourse(String id, CourseDto courseDto) {
        Course course = findById(id);
        course.setName(courseDto.getName());
        course.setDescription(courseDto.getDescription());
        update(course);
        return course;
    }

    public Course findByName(String courseName) {
        return find("name", courseName.toUpperCase()).firstResult();
    }

    public void deleteCourse(String id) {
        deleteById(id);
    }
}
