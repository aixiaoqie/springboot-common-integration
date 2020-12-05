package com.ssw.sharding.controller;

import com.ssw.sharding.entity.Student;
import com.ssw.sharding.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findAll")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void add(@RequestBody Student student) {
        studentService.add(student);
    }
}
