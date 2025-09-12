package com.mappings.jpa.dao;

import com.mappings.jpa.entity.Instructor;
import com.mappings.jpa.entity.InstructorDetail;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int id);
    void deleteInstructorById(int id);

    InstructorDetail findInstructorDetailById(int id);
    void deleteInstructorDetailById(int id);
}
