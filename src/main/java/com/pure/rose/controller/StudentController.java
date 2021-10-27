package com.pure.rose.controller;

import com.pure.rose.entity.Student;
import com.pure.rose.service.StudentService;
import com.pure.rose.service.UtilService;

import com.pure.rose.utils.InternalController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@InternalController
@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @Autowired
    UtilService utilService;

    @GetMapping("/{id}")
    public @ResponseBody Student getStudent(@PathVariable(name = "id")Integer id) {
        return studentService.test(id);
    }

    @GetMapping("/status/{status}")
    public @ResponseBody
    List<Student> getStudents(@PathVariable(name = "status")String status) {
        return studentService.schedule(status);
    }

    @GetMapping("/test")
    public String test() {
        return "test" + utilService.getName();
    }

}
