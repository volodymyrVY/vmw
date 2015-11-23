package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRACTOR")
@Inheritance(strategy= InheritanceType.JOINED)
public class Truck extends Item {

    @Column(name = "DISTANCE")
    private Long distance;

    @OneToOne
    @JoinColumn(name = "TRAILER_ID")
    private Trailer trailer;

    public Long getDistance() {
        return distance;
    }

    public void setDistance(Long distance) {
        this.distance = distance;
    }

    public Trailer getTrailer() {
        return trailer;
    }

    public void setTrailer(Trailer trailer) {
        this.trailer = trailer;
    }
}
