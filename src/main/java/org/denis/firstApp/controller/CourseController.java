package org.denis.firstApp.controller;

import org.denis.firstApp.dto.CourseDto;
import org.denis.firstApp.entity.Course;
import org.denis.firstApp.repository.CourseRepository;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/courses")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CourseController {

    @Inject
    CourseRepository courseRepository;

    @GET
    public List<Course> getAll() {
        return courseRepository.getAllCourses();
    }

    @GET
    @Path("{name}")
    public Course getByName(@PathParam("name") String name) {
        return courseRepository.findByName(name);
    }

    @POST
    @Transactional
    public void save(CourseDto courseDto) {
        courseRepository.save(courseDto);
    }

    @PUT()
    @Path("{id}")
    public Course update(@PathParam("id") String id, CourseDto courseDto) {
        return courseRepository.updateCourse(id, courseDto);
    }

    @DELETE
    @Path("{id}")
    public void delete(@PathParam("id") String id) {
        courseRepository.deleteCourse(id);
    }
}
