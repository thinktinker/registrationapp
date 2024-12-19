package model;

import java.util.Date;

/**
 * Person class is an abstract class
 * As an ABSTRACT class, I should not be able to
 * create an instance out of it
 *
 * As the attributes are set to final (immutable)
 * we will need the constructor to set each attribute
 */

public abstract class Person {

    private final String id;
    private final String name;
    private final String email;
    private final Date DOB;

    public Person(String id, String name, String email, Date DOB) {    // Overloaded constructor
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
    }

    // Getters and Setters (because you don't have direct access to the attributes)
    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getDOB() {
        return DOB;
    }

    // toString() method is a built-in method in Java (not visible)
    // therefore, we need to use the annotation @Override to override default implementation
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                '}';
    }
}
