package com.anataarisa.pimtool.model;

import java.sql.Date;

public class EmployeeDTO {
    private Number id;
    private String visa;
    private String firstName;
    private String lastName;
    private Date birthDay;
    private Number version;

    public EmployeeDTO() {

    }

    public EmployeeDTO(Number id, String visa, String firstName, String lastName, Date birthDay, Number version) {
        this.id = id;
        this.visa = visa;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.version = version;
    }

    public Number getId() {
        return this.id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public String getVisa() {
        return this.visa;
    }

    public void setVisa(String visa) {
        this.visa = visa;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public Number getVersion() {
        return this.version;
    }

    public void setVersion(Number version) {
        this.version = version;
    }
}
