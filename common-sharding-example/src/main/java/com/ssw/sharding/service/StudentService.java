package com.ssw.sharding.service;

import com.ssw.sharding.dao.StudentDao;
import com.ssw.sharding.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public List<Student> getAll(){
        return studentDao.findAll();
    }

}
