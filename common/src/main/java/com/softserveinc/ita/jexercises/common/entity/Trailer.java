package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRAILER")
@Inheritance(strategy= InheritanceType.JOINED)
public class Trailer extends Item {

    @Column(name = "AXIS")
    private String axis;

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }
}
