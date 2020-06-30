package org.denis.firstApp.entity;

import org.bson.types.ObjectId;

import java.util.Objects;

public class Materials {
    private ObjectId id;
    private TypeEnum type;
    private String title;
    private String image;
    private String link;
    private String description;

    public Materials() {
    }

    public Materials(ObjectId id, TypeEnum type, String title, String image, String link, String description) {
        this.id = id;
        this.type = type;
        this.title = title;
        this.image = image;
        this.link = link;
        this.description = description;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materials materials = (Materials) o;
        return id.equals(materials.id) &&
                type.equals(materials.type) &&
                title.equals(materials.title) &&
                image.equals(materials.image) &&
                link.equals(materials.link) &&
                description.equals(materials.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, title, image, link, description);
    }
}
