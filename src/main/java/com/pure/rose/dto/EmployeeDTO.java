package com.pure.rose.dto;

import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("EMPLOYEE")
public class EmployeeDTO extends Person {
    Integer age;
    String hobby;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
