package com.softserveinc.ita.jexercises.common.entity.mongo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Document(collection = "Trailer")
public class Trailer {

    private List<Image> images;

    @Field("common")
    private CommonAttribute commonAttribute;

    @Field("special")
    private TrailerSpecialAttribute trailerSpecialAttribute;

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public CommonAttribute getCommonAttribute() {
        return commonAttribute;
    }

    public void setCommonAttribute(CommonAttribute commonAttribute) {
        this.commonAttribute = commonAttribute;
    }

    public TrailerSpecialAttribute getTrailerSpecialAttribute() {
        return trailerSpecialAttribute;
    }

    public void setTrailerSpecialAttribute(TrailerSpecialAttribute trailerSpecialAttribute) {
        this.trailerSpecialAttribute = trailerSpecialAttribute;
    }
}
