package com.ssw.sharding.dao;

import com.ssw.sharding.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface StudentDao extends JpaRepository<Student,String>, JpaSpecificationExecutor<Student> {

    List<Student> findAll();
}
