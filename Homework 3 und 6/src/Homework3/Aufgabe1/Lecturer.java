package Homework3.Aufgabe1;

import java.util.ArrayList;

public class Lecturer extends User {
    private ArrayList<Course> managedCourses = new ArrayList<>();
    public Lecturer(String id, String firstName, String  lastName){
        super(id, firstName, lastName);
    }

    public ArrayList<Course> getManagedCourses() {
        return managedCourses;
    }

    public void setManagedCourses(ArrayList<Course> managedCourses) {
        this.managedCourses = managedCourses;
    }

    public void manage(Course pCourse){
        if(!managedCourses.contains(pCourse)){
            managedCourses.add(pCourse);
        }
    }

}