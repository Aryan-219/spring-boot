package com.irontutorials.cruddemo.dao;

import com.irontutorials.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student retrieveStudent(Integer studentId);

    List<Student> findPaul(String name);

    void update(Student student);

    void delete(Integer studentId);

    int deleteAll();
}
