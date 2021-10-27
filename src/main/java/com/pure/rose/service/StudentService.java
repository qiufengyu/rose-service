package com.pure.rose.service;

import com.pure.rose.entity.Student;
import com.pure.rose.repository.CourseRepository;
import com.pure.rose.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    UtilService utilService;

    @Autowired
    public StudentService(UtilService utilService) {
        this.utilService = utilService;
    }

    @Transactional
    public Student test(Integer id) {
        Student st = studentRepository.findStudentById(id);
        List<Student> s = IntStream.range(100, 120).boxed().map(sid -> new Student(null, "s" + sid, "A")).collect(Collectors.toList());
        studentRepository.saveAll(s);
        try {
            utilService.perform(s.get(0));
        } catch (Throwable exception) {
            exception.printStackTrace();
        }
        System.out.println(s.get(0).getStatus());
        return s.get(0);
    }

    @Transactional
    public List<Student> schedule(String status) {
        List<Student> s = studentRepository.findStudentByStatus(status);
        studentRepository.updateStudentById(s.get(0).getId(), "Scheduled");
        return s;
    }
}
