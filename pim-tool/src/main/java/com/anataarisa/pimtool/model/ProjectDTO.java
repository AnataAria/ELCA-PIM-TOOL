package com.anataarisa.pimtool.model;

import java.sql.Date;
import java.util.List;

public class ProjectDTO {
    private Number id;
    private GroupDTO projectGroup;
    private Number projectNumber;
    private String name;
    private List<EmployeeDTO> employeeList;
    private String customer;
    private String status;
    private Date startDate;
    private Date endDate;
    private Number version;

    public ProjectDTO(Number id, GroupDTO projectGroup, Number projectNumber, String name,
            List<EmployeeDTO> employeeList, String customer, String status, Date startDate, Date endDate,
            Number version) {
        this.id = id;
        this.projectGroup = projectGroup;
        this.projectNumber = projectNumber;
        this.name = name;
        this.employeeList = employeeList;
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

    public GroupDTO getProjectGroup() {
        return this.projectGroup;
    }

    public void setProjectGroup(GroupDTO projectGroup) {
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

    public List<EmployeeDTO> getEmployeeList() {
        return this.employeeList;
    }

    public void setEmployeeList(List<EmployeeDTO> employeeList) {
        this.employeeList = employeeList;
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