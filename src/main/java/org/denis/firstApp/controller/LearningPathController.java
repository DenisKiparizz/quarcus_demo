package org.denis.firstApp.controller;

import org.denis.firstApp.dto.LearningPathsDto;
import org.denis.firstApp.entity.CoursesEnum;
import org.denis.firstApp.entity.TypeEnum;
import org.denis.firstApp.entity.LearningPath;
import org.denis.firstApp.repository.LearningPathRepository;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/learningPath")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class LearningPathController {

    @Inject
    LearningPathRepository learningPathRepository;

    @GET
    public List<LearningPath> getAll() {
        return learningPathRepository.getAllCourses();
    }

    @POST
    public void saveLearningPath(LearningPathsDto learningPath) {
        learningPathRepository.save(learningPath);
    }

    @GET
    @Path("{name}")
    public List<LearningPath> findByName(@PathParam("name") CoursesEnum name) {
        return learningPathRepository.findByName(name);
    }
}
