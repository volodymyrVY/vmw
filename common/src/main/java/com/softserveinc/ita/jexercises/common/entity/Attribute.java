package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name="ATTRIBUTE")
public class Attribute extends BaseEntity {

    @Column(name="NAME", nullable = false)
   private String name;

    @OneToMany
    private List<AttributeValue> attributes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
