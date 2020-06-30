package org.denis.firstApp.mapper;

import org.bson.types.ObjectId;
import org.denis.firstApp.dto.MaterialsDto;
import org.denis.firstApp.entity.Materials;
import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class MaterialsMapper {

    public Materials maoToMaterials(MaterialsDto materialsDto) {
        Materials materials = new Materials();
        materials.setId(ObjectId.get());
        materials.setType(materialsDto.getType());
        materials.setDescription(materialsDto.getDescription());
        materials.setImage(materialsDto.getImage());
        materials.setLink(materialsDto.getLink());
        materials.setTitle(materialsDto.getTitle());
        return materials;
    }

    public List<Materials> mapList(List<MaterialsDto> materialsList) {
        return materialsList
                .stream()
                .map(this::maoToMaterials)
                .collect(Collectors.toList());
    }
}
