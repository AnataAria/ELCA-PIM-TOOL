package com.anataarisa.pimtool.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "GROUPS")
public class Group implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", length = 19, columnDefinition = "decimal")
    private Number id;
    @OneToOne(orphanRemoval = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "ID")
    private Employee groupLeader;
    @Column(name = "Version", nullable = false, columnDefinition = "decimal")
    private Number version;

    public Group() {
    }

    public Group(Number id, Employee groupLeader, Number version) {
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

    public Employee getGroupLeader() {
        return this.groupLeader;
    }

    public void setGroupLeader(Employee groupLeader) {
        this.groupLeader = groupLeader;
    }

    public Number getVersion() {
        return this.version;
    }

    public void setVersion(Number version) {
        this.version = version;
    }

}
