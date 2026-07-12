package com.myProject.studentManagemant.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rollNo;

    private String name;

    private String className;

    private String section;

    private float percentage;

    private String location;

    private String transport;

    
    public Student(Long rollNo, String name, String className, String section, float percentage, String location, String transport) {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
        this.section = section;
        this.percentage = percentage;
        this.location = location;
        this.transport = transport;
    }


    public Student() {
    }


    public Long getRollNo() {
        return rollNo;
    }


    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getClassName() {
        return className;
    }


    public void setClassName(String className) {
        this.className = className;
    }


    public String getSection() {
        return section;
    }


    public void setSection(String section) {
        this.section = section;
    }


    public float getPercentage() {
        return percentage;
    }


    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }


    public String getLocation() {
        return location;
    }


    public void setLocation(String location) {
        this.location = location;
    }


    public String getTransport() {
        return transport;
    }


    public void setTransport(String transport) {
        this.transport = transport;
    }


    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", className=" + className + ", section=" + section
                + ", percentage=" + percentage + ", location=" + location + ", transport=" + transport + "]";
    }

    
    
}
