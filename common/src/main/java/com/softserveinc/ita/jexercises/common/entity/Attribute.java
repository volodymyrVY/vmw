package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity(name = "ATTRIBUTE")
public class Attribute extends BaseEntity {

    @Column(name = "GROUP_NAME", nullable = false)
    private String groupName;

    @Column (name = "DISPLAY_VIEW", nullable = false)
    private String displayView;

    @OneToMany
    private List<AttributeValue> attributes;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<AttributeValue> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeValue> attributes) {
        this.attributes = attributes;
    }
}
