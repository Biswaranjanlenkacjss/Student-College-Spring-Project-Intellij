package com.springboot.student.dto;

public class CollegeDao {
    private int id;
    private String collegeName;
    private String branch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public CollegeDao() {
    }

    public CollegeDao(int id, String collegeName, String branch) {
        this.id = id;
        this.collegeName = collegeName;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "CollegeDao{" +
                "id=" + id +
                ", collegeName='" + collegeName + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
