package com.fq.pojo;

import javax.sql.rowset.spi.SyncResolver;

public class Course {
    private String name;
    private String teacher;

    public Course(String name, String teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
