package com.springboot.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stuCollege")
public class College {
    @Id
    private int id;

    private String collegeName;

    private String branch;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public College() {
    }

    public College(int id, String collegeName, String branch) {
        this.id = id;
        this.collegeName = collegeName;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "College{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
