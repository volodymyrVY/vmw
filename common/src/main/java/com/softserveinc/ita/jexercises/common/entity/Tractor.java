package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "TRACTOR")
@Inheritance(strategy= InheritanceType.JOINED)
public class Tractor {
}
