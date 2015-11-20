package com.softserveinc.ita.jexercises.common.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="TIR")
public class Item extends BaseEntity {

    @Column(name="NAME", nullable = false)
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "MANUFACTURED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date manufacturedDate;

    @ManyToMany
    private ItemAttribute attribute;


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
