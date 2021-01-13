package com.pure.rose.repository;

import com.pure.rose.entity.Student;

import java.util.List;

public interface StudentCustomRepository {
    List<Student> findStudentByStatus(String status);

    Student findStudentById(Integer id);

    void updateStudentById(Integer id, String status);
}
