package com.anataarisa.pimtool.model;

public class GroupDTO {
    private Number id;
    private EmployeeDTO groupLeader;
    private Number version;

    public GroupDTO(Number id, EmployeeDTO groupLeader, Number version) {
        this.id = id;
        this.groupLeader = groupLeader;
        this.version = version;
    }

    public Number getId() {
        return this.id;
    }

    public void setId(Number id) {
        this.id = id;
    }

    public EmployeeDTO getGroupLeader() {
        return this.groupLeader;
    }

    public void setGroupLeader(EmployeeDTO groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Number getVersion() {
        return this.version;
    }

    public void setVersion(Number version) {
        this.version = version;
    }
}