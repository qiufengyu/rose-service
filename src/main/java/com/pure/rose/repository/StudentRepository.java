package com.pure.rose.repository;

import com.pure.rose.entity.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer>, StudentCustomRepository {
    List<Student> findAllByStatusEquals(String status);
}
