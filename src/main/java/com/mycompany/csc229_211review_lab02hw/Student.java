package com.mycompany.csc229_211review_lab02hw;

/**
 * Student class representing a student entity.
 * Inherits common attributes from Person.
 *
 * @author Catherine Guerrieri
 */
// ToDo 1: Make this class a child of Person
public class Student extends Person {

    // ToDo 3: Add a field for GPA
    private double gpa;

    // Backing variable for the abstract address methods
    private String address;

    // ToDo 2 & ToDo 6: Constructors invoking super
    public Student(String name, short age) {
        super(name, age);
    }

    public Student(String name, short age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    // ToDo 2: Implement abstract methods defined in Person
    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    // ToDo 3: Getter and Setter for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // ToDo 7: toString method returning formatted Student details
    @Override
    public String toString() {
        return "Student Name: " + getName() +
                ", Age: " + getAge() +
                ", GPA: " + gpa;
    }
}