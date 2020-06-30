package org.denis.firstApp.mapper;

import org.bson.types.ObjectId;
import org.denis.firstApp.dto.LearningPathsDto;
import org.denis.firstApp.entity.LearningPath;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class LearningPathMapper {
    @Inject
    MaterialsMapper materialsMapper;

    public LearningPath mapToLearningPath(LearningPathsDto dto) {
        LearningPath learningPath = new LearningPath();
        learningPath.setId(ObjectId.get());
        learningPath.setName(dto.getName());
        learningPath.setDescription(dto.getDescription());
        learningPath.setLink(dto.getLink());
        learningPath.setImage(dto.getImage());
        learningPath.setMaterials(materialsMapper.mapList(dto.getMaterials()));
        return learningPath;
    }
}