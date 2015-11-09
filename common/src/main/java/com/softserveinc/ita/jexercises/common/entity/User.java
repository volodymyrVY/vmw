package com.softserveinc.ita.jexercises.common.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.softserveinc.ita.jexercises.common.entity.utils.Gender;
import com.softserveinc.ita.jexercises.common.entity.utils.Role;

@Entity
@Table(name = "USER")
public class User extends BaseEntity {

    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;

    @Column(name = "EMAIL", unique = true, nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "ROLE", nullable = false)
    private Role role;

    @Column(name = "BIRTH_DATE", nullable = false)
    private Date birthDate;

    @Column (name = "PHONE")
    private Integer phone;

    @Column (name = "MOBILE_PHONE")
    private Integer mobPhone;

    @Column(name="GENDER", nullable = false)
    private Gender gender;

   private List<Photo> avatars;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(Integer mobPhone) {
        this.mobPhone = mobPhone;
    }

    public List<Photo> getAvatars() {
        return avatars;
    }

    public void setAvatars(List<Photo> avatars) {
        this.avatars = avatars;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
