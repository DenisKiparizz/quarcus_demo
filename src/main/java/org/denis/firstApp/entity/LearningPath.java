package org.denis.firstApp.entity;

import io.quarkus.mongodb.panache.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonId;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@MongoEntity(collection = "learns")
public class LearningPath {
    @BsonId
    private ObjectId id;
    private CoursesEnum name;
    private String description;
    private String image;
    private String link;
    private List<Materials> materials = new ArrayList<>();

    public LearningPath(ObjectId id, CoursesEnum name, String description, String image, String link, List<Materials> materials) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.link = link;
        this.materials = materials;
    }

    public LearningPath() {
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
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

    public List<Materials> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Materials> materials) {
        this.materials = materials;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LearningPath that = (LearningPath) o;
        return name.equals(that.name) &&
                description.equals(that.description) &&
                image.equals(that.image) &&
                link.equals(that.link) &&
                materials.equals(that.materials);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, image, link, materials);
    }
}
