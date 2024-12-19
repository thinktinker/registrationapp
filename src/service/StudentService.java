package service;

import model.Course;
import model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentService {

    private final Map<String, Student> students = new HashMap<>();

    public void subscribeStudent(Student student) {                        // subscribeStudent
        students.put(student.getId(), student);
    }

    public Student findStudent(String studentId) {                         // findStudent
        if (students.containsKey(studentId)) {
            return students.get(studentId);
        }
        return null;
    }

    public void enrollStudentToCourse(String studentId, Course course) {  // enrollStudentToCourse
        if (students.containsKey(studentId)) {                            // Check that the student exists
            students.get(studentId).enrollToCourse(course);               // enroll student to course
        }
    }

    public boolean isSubscribed(String studentId) {                        // Check if the student is subscribed
        // TODO
        return students.containsKey(studentId);
    }
    public void showSummary(){                                            // Show summary of all the subscribed students
        // TODO
    }
}
