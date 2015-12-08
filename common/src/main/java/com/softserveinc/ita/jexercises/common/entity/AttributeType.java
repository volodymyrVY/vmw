package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.*;

@Entity
@Table(name = "ATTRIBUTE_TYPE")
@Inheritance(strategy = InheritanceType.JOINED)
public class AttributeType extends BaseEntity {

    @Enumerated(EnumType.STRING)
    private Type attributeType;

    public Type getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(Type attributeType) {
        this.attributeType = attributeType;
    }

    public enum Type {
        TIR("Tir"),
        TRAILER("Trailer"),
        COMMON("Common");

        private String value;

        Type(String value) {
            this.value = value;
        }

        public String getValue(){
            return value;
        }
    }
}
