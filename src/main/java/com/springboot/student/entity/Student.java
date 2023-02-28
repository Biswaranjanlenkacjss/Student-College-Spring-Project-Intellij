package com.springboot.student.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @Column(name="stuId")
    private int id;

    private String stuName;

    private String Address;

  @OneToOne(cascade = CascadeType.ALL)
    private College college;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public Student() {
    }

    public Student(int id, String stuName, String address, College college) {
        this.id = id;
        this.stuName = stuName;
        Address = address;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", stuName='" + stuName + '\'' +
                ", Address='" + Address + '\'' +
                ", college=" + college +
                '}';
    }

}
