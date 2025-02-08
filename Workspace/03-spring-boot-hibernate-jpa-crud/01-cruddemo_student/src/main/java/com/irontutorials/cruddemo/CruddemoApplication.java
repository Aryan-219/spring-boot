package com.irontutorials.cruddemo;

import com.irontutorials.cruddemo.dao.StudentDAO;
import com.irontutorials.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
        return runner -> {
//			  createStudent(studentDAO);

			  createMultipleStudents(studentDAO);

//			  retrieveStudent(studentDAO);

//			  findpaul(studentDAO);

//            updateStudent(studentDAO);

//            deleteStudent(studentDAO);

//            deleteAllStudents(studentDAO);
        };
    }

    private void deleteAllStudents(StudentDAO studentDAO) {
        System.out.println("Deleting all the students");
        int numRowsDeleted = studentDAO.deleteAll();
        System.out.println("Rows affected: " + numRowsDeleted);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int studentId = 3;
        System.out.println("Deleting student with id: " + studentId);
        studentDAO.delete(studentId);

    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentId = 1;
        System.out.println("getting student with student id " + studentId);
//		retrieve the student by id : primary key
        Student myStudent = studentDAO.retrieveStudent(studentId);

//		 change first name to scooby
        System.out.println("Updating student");
        myStudent.setFirstName("Scooby");

//		update the student
        studentDAO.update(myStudent);

//		display the student
        System.out.println("Updated student " + myStudent);
    }

    private void findpaul(StudentDAO studentDAO) {
        List<Student> students = studentDAO.findPaul("Doe");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private void retrieveStudent(StudentDAO studentDAO) {
        System.out.println("Creating 3 new student objects...");
        Student tempStudent = new Student("Aryan", "aryan@luv2code.com", "Agrawal");
        System.out.println("Saving the student object ...");
        studentDAO.save(tempStudent);

        System.out.println("Retrieving student with the id : " + tempStudent.getId());
        Student s = studentDAO.retrieveStudent(tempStudent.getId());

        System.out.println(s);
    }

    private void createMultipleStudents(StudentDAO studentDAO) {
//		create the student object
        System.out.println("Creating 3 new student objects...");
        Student tempStudent1 = new Student("Paul1", "paul1@luv2code.com", "Doe1");
        Student tempStudent2 = new Student("Paul2", "paul2@luv2code.com", "Doe2");
        Student tempStudent3 = new Student("Paul3", "paul3@luv2code.com", "Doe3");

        System.out.println("Saving the student object ...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);

        //		display the id of saved student
        System.out.println("Displaying the id of newly created student ..." + tempStudent1.getId());
        System.out.println("Displaying the id of newly created student ..." + tempStudent2.getId());
        System.out.println("Displaying the id of newly created student ..." + tempStudent3.getId());
    }

    private void createStudent(StudentDAO studentDAO) {
//		create the student object
        System.out.println("Creating a new student object...");
        Student tempStudent = new Student("Paul", "paul@luv2code.com", "Doe");

//		save the Student object
        System.out.println("Saving the student object ...");
        studentDAO.save(tempStudent);

//		display the id of saved student
        System.out.println("Displaying the id of newly created student ..." + tempStudent.getId());

    }
}
