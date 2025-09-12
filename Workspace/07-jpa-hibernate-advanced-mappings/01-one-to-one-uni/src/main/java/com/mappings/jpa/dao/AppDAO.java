package com.mappings.jpa.dao;

import com.mappings.jpa.entity.Instructor;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);
}
