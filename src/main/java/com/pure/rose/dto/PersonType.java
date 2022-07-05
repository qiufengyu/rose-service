package com.pure.rose.dto;

public enum PersonType {
    TEACHER("Teacher"),
    STUDENT("Student"),
    EMPLOYEE("Employee");

    String value;

    PersonType(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        if ("teacher".equalsIgnoreCase(value)) {
            this.value = "Teacher";
        } else if ("student".equalsIgnoreCase(value)) {
            this.value = "Student";
        } else {
            this.value = "Employee";
        }
    }

    public static PersonType parse(String value) {
        if ("teacher".equalsIgnoreCase(value)) {
            return TEACHER;
        } else if ("student".equalsIgnoreCase(value)) {
            return STUDENT;
        } else {
            return EMPLOYEE;
        }
    }

}
