package com.mappings.jpa;

import com.mappings.jpa.dao.AppDAO;
import com.mappings.jpa.entity.Instructor;
import com.mappings.jpa.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
//            System.out.println("Hello World !");
//            createInstructor(appDAO);
//            findInstructor(appDAO);
//            deleteInstructor(appDAO);
        };
    }

    private void deleteInstructor(AppDAO appDAO) {
        int id=2;
        System.out.println("Deleting the instructor by id: "+id);
        appDAO.deleteInstructorById(id);
        System.out.println("Done!");
    }

    private void findInstructor(AppDAO appDAO) {
        int id = 2;
        System.out.println("Finding instructor by id: " + id);
        Instructor instructor = appDAO.findInstructorById(id);
        System.out.println("Instructor: " + instructor);
        System.out.println("Instructor detail " + instructor.getInstructorDetail());
    }

    private void createInstructor(AppDAO appDAO) {
/*
//		create the instructor
        Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@luv@code.com");

//		create the instructor detail object
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Luv2Code!!!");
*/

//		create the instructor
        Instructor tempInstructor = new Instructor("Aryan", "Agrawal", "aryanagr219@gmail.com");

//		create the instructor detail object
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.google.com", "CODE KARLE BHAI!!!");

//		associate the objects
        tempInstructor.setInstructorDetail(tempInstructorDetail);

//		save the instructor
        System.out.println("Saving instructor: " + tempInstructor);
        appDAO.save(tempInstructor);
        System.out.println("Done!");
    }
}
