package com.softserveinc.ita.jexercises.common.entity;

import javax.persistence.*;

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

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column (name = "PHONE")
    private Integer phone;

    @Enumerated(EnumType.STRING)
    private Gender gender;

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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public enum Role {

        ADMIN_ROLE,

        USER_ROLE
    }


    public enum Gender {

        MALE("Male"),
        FEMALE("Female");

        private String value;

        Gender(String value) {
            this.value = value;
        }

        public String getValue(){
            return value;
        }
    }
}
