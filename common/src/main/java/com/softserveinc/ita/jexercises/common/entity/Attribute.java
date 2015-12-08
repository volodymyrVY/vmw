package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "ATTRIBUTE")
public class Attribute extends AttributeType {

    @Column(name = "GROUP_NAME", nullable = false)
    private String groupName;

    @Column (name = "DISPLAY_VIEW", nullable = false)
    private String displayView;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,
            mappedBy = "attribute")
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
