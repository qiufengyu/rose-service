package com.pure.rose.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName(value = "STUDENT")
public class StudentDTO extends Person {
    String studentName;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
