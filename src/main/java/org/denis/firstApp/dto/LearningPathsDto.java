package org.denis.firstApp.dto;

import org.denis.firstApp.entity.CoursesEnum;
import java.util.ArrayList;
import java.util.List;

public class LearningPathsDto {
    private CoursesEnum name;
    private String description;
    private String image;
    private String link;
    private List<MaterialsDto> materials = new ArrayList<>();

    public LearningPathsDto() {
    }

    public LearningPathsDto(CoursesEnum name, String description, String image, String link, List<MaterialsDto> materials) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.link = link;
        this.materials = materials;
    }

    public CoursesEnum getName() {
        return name;
    }

    public void setName(CoursesEnum name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<MaterialsDto> getMaterials() {
        return materials;
    }

    public void setMaterials(List<MaterialsDto> materials) {
        this.materials = materials;
    }
}
