package com.anataarisa.pimtool.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROJECT")
public class Project {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Number id;
    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Group.class)
    private Group projectGroup;
    @Column(name = "PROJECT_NUMBER", nullable = false, unique = true)
    private Number projectNumber;
    @Column(name = "NAME", nullable = false)
    private String name;
    @Column(name = "CUSTOMER", nullable = false)
    private String customer;
    @Column(name = "STATUS", nullable = false, length = 3)
    private String status;
    @Column(name="START_DATE", nullable = false)
    private Date startDate;
    @Column(name="END_DATE", nullable = true)
    private Date endDate;
    @Column(name="VERSION", nullable = false)
    private Number version;

    public Project() {
        super();
    }


    public Project(Number id, Group projectGroup, Number projectNumber, String name, String customer, String status,
            Date startDate, Date endDate, Number version) {
        this.id = id;
        this.projectGroup = projectGroup;
        this.projectNumber = projectNumber;
        this.name = name;
        this.customer = customer;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
        this.version = version;
    }
    

    public Number getId() {
        return this.id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public Group getProjectGroup() {
        return this.projectGroup;
    }

    public void setProjectGroup(Group projectGroup) {
        this.projectGroup = projectGroup;
    }

    public Number getProjectNumber() {
        return this.projectNumber;
    }

    public void setProjectNumber(Number projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer() {
        return this.customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Number getVersion() {
        return this.version;
    }

    public void setVersion(Number version) {
        this.version = version;
    }
    
}
