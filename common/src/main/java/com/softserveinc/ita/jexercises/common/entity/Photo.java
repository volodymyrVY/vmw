package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.Lob;

public class Photo extends BaseEntity {

    /**
     * User avatar picture.
     */
    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(name = "Image")
    private byte[] img;

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
