package com.softserveinc.ita.jexercises.common.entity.mongo;

import org.springframework.data.mongodb.core.mapping.Field;

public final class Image {

    private String path;

    @Field("main")
    private boolean mainImage;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isMainImage() {
        return mainImage;
    }

    public void setMainImage(boolean mainImage) {
        this.mainImage = mainImage;
    }
}
