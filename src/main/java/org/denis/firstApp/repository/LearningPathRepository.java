package org.denis.firstApp.repository;

import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;
import org.denis.firstApp.dto.LearningPathsDto;
import org.denis.firstApp.entity.CoursesEnum;
import org.denis.firstApp.entity.TypeEnum;
import org.denis.firstApp.entity.LearningPath;
import org.denis.firstApp.mapper.LearningPathMapper;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class LearningPathRepository implements PanacheMongoRepository<LearningPath> {

    @Inject
    LearningPathMapper learningPathMapper;

    public List<LearningPath> getAllCourses() {
        return listAll();
    }


    public void save(LearningPathsDto learningPath) {
        persist(learningPathMapper.mapToLearningPath(learningPath));
    }

    public List<LearningPath> findByName(CoursesEnum name) {
        return find("name", name).list();
    }

}
