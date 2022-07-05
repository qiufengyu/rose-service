package com.pure.rose.controller;

import com.pure.rose.dto.Person;
import com.pure.rose.entity.Student;
import com.pure.rose.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/{id}")
    public @ResponseBody Student getStudent(@PathVariable(name = "id")Integer id) {
        return studentService.test(id);
    }

    @GetMapping("/status/{status}")
    public @ResponseBody
    List<Student> getStudents(@PathVariable(name = "status")String status) {
        return studentService.schedule(status);
    }

    @PostMapping()
    public @ResponseBody Person testStudent(@RequestBody Person person) {
        return studentService.getPerson(person);
    }

}
