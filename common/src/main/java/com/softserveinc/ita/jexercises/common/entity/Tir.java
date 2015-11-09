package com.softserveinc.ita.jexercises.common.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name="TIR")
public class Tir extends BaseEntity {

    @Column(name="NAME", nullable = false)
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private Integer price;


    private List<Photo> photos;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
