package com.softserveinc.ita.jexercises.common.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="TIR")
public class Item extends BaseEntity {

    @Column (name = "MANUFACTURER", nullable = false)
    private String manufacturer;

    @Column (name = "MODEL")
    private String model;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name = "PRICE")
    private Integer price;

    @Column(name = "MANUFACTURED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date manufacturedDate;

    @Column (name = "COLOR")
    private String color;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,
            mappedBy = "img")
    private List<Image> images;

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

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getManufacturedDate() {
        return manufacturedDate;
    }

    public void setManufacturedDate(Date manufacturedDate) {
        this.manufacturedDate = manufacturedDate;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
