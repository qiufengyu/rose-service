package com.pure.rose.controller.external;

import com.pure.rose.utils.ExternalController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ExternalController
@RestController
@RequestMapping(path = "/external/students")
public class ExternalStudentController {
    @GetMapping("/test")
    public String test() {
        return "test in external student controller";
    }
}
