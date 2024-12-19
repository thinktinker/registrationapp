package model;

import java.util.List;

/**
 * An interface is an abstract class
 * that provides method signatures of
 * what a class must implement
 */
public interface Evaluation {

    // getApprovedCourses is a method that returns a list of Courses
    List<Course> getApprovedCourses();
}
