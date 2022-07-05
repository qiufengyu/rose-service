package com.pure.rose.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.List;

@JsonTypeName(value = "TEACHER")
public class TeacherDTO extends Person {
    List<String> students;

    public List<String> getStudents() {
        return students;
    }

    public void setStudents(List<String> students) {
        this.students = students;
    }
}
