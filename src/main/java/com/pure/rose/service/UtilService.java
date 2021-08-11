package com.pure.rose.service;

import com.pure.rose.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class UtilService {
    public boolean perform(Student s) {
        if (s == null) {
            return false;
        }
        if (s.getName().contains("s")) {
            throw new RuntimeException("Cannot contain s!");
        }
        return true;
    }
}
