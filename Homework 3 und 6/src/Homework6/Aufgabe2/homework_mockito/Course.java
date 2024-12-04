package Homework6.Aufgabe2.homework_mockito;

import java.util.List;

public class Course {
    private final String id;
    private final List<ExerciseGroup> exerciseGroups;

    public Course(String id, List<ExerciseGroup> exerciseGroups) {
        this.id = id;
        this.exerciseGroups = exerciseGroups;
    }

    public String getId() {
        return id;
    }

    public List<ExerciseGroup> getExerciseGroups() {
        return exerciseGroups;
    }
}