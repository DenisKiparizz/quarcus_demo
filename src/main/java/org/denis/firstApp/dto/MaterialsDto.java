package org.denis.firstApp.dto;

import org.denis.firstApp.entity.TypeEnum;

public class MaterialsDto {
    private TypeEnum type;
    private String title;
    private String image;
    private String link;
    private String description;

    public MaterialsDto(TypeEnum type, String title, String image, String link, String description) {
        this.type = type;
        this.title = title;
        this.image = image;
        this.link = link;
        this.description = description;
    }

    public MaterialsDto() {
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
}
