package com.forms.model;

import com.sun.scenario.effect.impl.prism.PrImage;

import java.util.Date;

/**
 * Created by D on 4/9/2017.
 */
public class Contact {

    public enum College{
        AAAAA,
        BBBBB,
        CCCCC
    }

    private String lastName;
    private String firstName;
    private Long studentId;
    private String email;
    private Date birthDate;
    private College college;
    private String comment;


    public Contact(String lastName, String firstName, Long studentId, String email, Date birthDate, College college, String comment) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentId = studentId;
        this.email = email;
        this.birthDate = birthDate;
        this.college = college;
        this.comment = comment;
    }

    public Contact() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
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

    public College getCollege() {
        return college ;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
