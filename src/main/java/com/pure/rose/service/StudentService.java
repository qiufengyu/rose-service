package com.pure.rose.service;

import com.pure.rose.entity.Student;
import com.pure.rose.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Transactional
    public Student cancel(Integer id) {
        Student s = studentRepository.findStudentById(id);
        studentRepository.updateStudentById(s.getId(), "Q");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Transactional
    public List<Student> schedule(String status) {
        List<Student> s = studentRepository.findStudentByStatus(status);
        studentRepository.updateStudentById(s.get(0).getId(), "Q");
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return s;
    }
}
