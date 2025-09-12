package com.mappings.jpa;

import com.mappings.jpa.dao.AppDAO;
import com.mappings.jpa.entity.Course;
import com.mappings.jpa.entity.Instructor;
import com.mappings.jpa.entity.InstructorDetail;
import com.mappings.jpa.entity.Review;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {
        return runner -> {
            // System.out.println("Hello World !");
            // createInstructor(appDAO);
            // findInstructor(appDAO);
            // deleteInstructor(appDAO);
            // findInstructorDetail(appDAO);
            // deleteInstructorDetail(appDAO);
            // createInstructorWithCourses(appDAO);
            // findInstructorWithCourses(appDAO);
            // findCoursesForInstructor(appDAO);
            // findInstructorWithCoursesJoinFetch(appDAO);
            // updateInstructor(appDAO);
            // updateCourse(appDAO);
            // deleteCourse(appDAO);
            // createCourseAndReviews(appDAO);
            // retreiveCourseAndReviews(appDAO);
            deleteCourseAndReviews(appDAO);
        };
    }

    private void deleteCourseAndReviews(AppDAO appDAO) {
        int theId = 10;
        System.out.println("Deleting course with id: " + theId);

        appDAO.deleteCourseById(theId);
        System.out.println("Done!");
    }

    private void retreiveCourseAndReviews(AppDAO appDAO) {

        // get the course and reviews
        int id = 10;
        Course tempCourse = appDAO.findCourseAndReviewsByCourseId(id);

        // print the course
        System.out.println("Course is: " + tempCourse);

        // print the reviews
        System.out.println("Associated Reviews: " + tempCourse.getReviews());
        System.out.println("Done!");
    }

    private void createCourseAndReviews(AppDAO appDAO) {
        // create a course
        Course tempCourse = new Course("Pacman - How to score a million points");

        // add some reviews
        tempCourse.add(new Review("Great course!"));
        tempCourse.add(new Review("Awesome course!"));
        tempCourse.add(new Review("Superb content!"));

        System.out.println("Saving course");
        System.out.println(tempCourse);
        System.out.println(tempCourse.getReviews());

        // save the course
        appDAO.save(tempCourse);

        System.out.println("Done!");
    }

    private void deleteCourse(AppDAO appDAO) {
        int theId = 10;
        System.out.println("Deleting course with id: " + theId);
        appDAO.deleteCourseById(theId);
        System.out.println("Done");
    }

    private void updateCourse(AppDAO appDAO) {
        int theId = 10;

        // find the course
        System.out.println("Finding course with id: " + theId);
        Course tempCourse = appDAO.findCourseById(theId);

        // update the course
        System.out.println("Updating the course with id: " + theId);
        tempCourse.setTitle("Ultimate Spring Boot Course");
        appDAO.update(tempCourse);
        System.out.println("Done!");
    }

    private void updateInstructor(AppDAO appDAO) {
        int theId = 1;
        // find the instructor
        System.out.println("Finding instructor with id: " + theId);
        Instructor tempInstructor = appDAO.findInstructorById(theId);

        // update the instructor
        System.out.println("Updating instructor id: " + theId);

        tempInstructor.setLastName("choudhary");
        appDAO.update(tempInstructor);
        System.out.println("Done!");
    }

    private void findInstructorWithCoursesJoinFetch(AppDAO appDAO) {
        int theId = 1;

//        find the instructor
        System.out.println("Finding instructor with id: " + theId);
        Instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(theId);
        System.out.println("Instructor : " + tempInstructor);
        System.out.println("Associated courses: " + tempInstructor.getCourses());
        System.out.println("Done");
    }

    private void findCoursesForInstructor(AppDAO appDAO) {
        int id = 1;
        System.out.println("Finding instructor with id: " + id);
        Instructor tempInstructor = appDAO.findInstructorById(id);
        System.out.println("The instructor" + tempInstructor);
        System.out.println("Finding courses for instructor id: " + id);
        List<Course> courses = appDAO.findCoursesByInstructorId(id);
        tempInstructor.setCourses(courses);
        System.out.println("The associated courses: " + tempInstructor.getCourses());
        System.out.println("Done!");
    }

    // this was probably for demonstrating eager fetch type and probably the method name is also wrong(might need swapping)
    private void findInstructorWithCourses(AppDAO appDAO) {
        int id = 1;
        System.out.println("Finding instructor with id: " + id);
        Instructor tempInstructor = appDAO.findInstructorById(id);
        System.out.println("The instructor" + tempInstructor);
        System.out.println("Associated courses: " + tempInstructor.getCourses());
        System.out.println("Done");
    }

    private void createInstructorWithCourses(AppDAO appDAO) {
        // create the instructor
        Instructor tempInstructor = new Instructor("anushk", "jain", "anushk2201@gmail.com");

        // create the instructor detail object
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.youtube.com", "CODE IN DARK!!!");

        // associate the objects
        tempInstructor.setInstructorDetail(tempInstructorDetail);

        Course course1 = new Course("Spring boot guide");
        Course course2 = new Course("React Masterclass");
        tempInstructor.add(course1);
        tempInstructor.add(course2);
        System.out.println("Saving the instructor" + tempInstructor);
        System.out.println("Saving courses" + tempInstructor.getCourses());
        appDAO.save(tempInstructor);
        System.out.println("Done!");
    }

    private void deleteInstructorDetail(AppDAO appDAO) {
        int theId = 4;
        System.out.println("Deleting instructor detail with id: " + theId);
        appDAO.deleteInstructorDetailById(theId);
        System.out.println("Done");
    }

    private void findInstructorDetail(AppDAO appDAO) {
        int id = 4;
        System.out.println("Finding instructor detail by id: " + id);
        InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(id);
        System.out.println("Instructor detail: " + tempInstructorDetail);
        System.out.println("Associated instructor: " + tempInstructorDetail.getInstructor());
    }

    private void deleteInstructor(AppDAO appDAO) {
        int id = 1;
        System.out.println("Deleting the instructor by id: " + id);
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

//		create the instructor
        Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@luv@code.com");

//		create the instructor detail object
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Luv2Code!!!");


/*
//		create the instructor
        Instructor tempInstructor = new Instructor("Aryan", "Agrawal", "aryanagr219@gmail.com");

//		create the instructor detail object
        InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.google.com", "CODE KARLE BHAI!!!");
*/

//		associate the objects
        tempInstructor.setInstructorDetail(tempInstructorDetail);

//		save the instructor
        System.out.println("Saving instructor: " + tempInstructor);
        appDAO.save(tempInstructor);
        System.out.println("Done!");
    }
}
