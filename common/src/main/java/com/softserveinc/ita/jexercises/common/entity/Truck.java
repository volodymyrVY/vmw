package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "TRACTOR")
@Inheritance(strategy= InheritanceType.JOINED)
public class Truck {

    @Column(name = "DISTANCE")
    private Long distance;


}
