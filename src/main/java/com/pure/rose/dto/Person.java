package com.pure.rose.dto;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.DEDUCTION,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = StudentDTO.class, name = "STUDENT"),
        @JsonSubTypes.Type(value = TeacherDTO.class, name = "TEACHER"),
        @JsonSubTypes.Type(value = EmployeeDTO.class, name = "EMPLOYEE")
})
public class Person {
    public PersonType getType() {
        return type;
    }

    public void setType(PersonType type) {
        this.type = type;
    }

    PersonType type;


}
