package Homework6.Aufgabe2.test;

import Homework6.Aufgabe2.homework_mockito.Course;
import Homework6.Aufgabe2.homework_mockito.ExerciseGroup;
import Homework6.Aufgabe2.homework_mockito.Student;
import Homework6.Aufgabe2.homework_mockito.StudentManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentManagerTest {

    private StudentManager studentManager;
    private Course courseMock;
    private List<Course> courses;


    @BeforeEach
    public void setup() {
        // Mock für den Kurs
        courses = new ArrayList<>();
        courseMock = mock(Course.class);
        studentManager = new StudentManager(null, courses); // Kursliste mit Mock
    }

    @Test
    public void testGenerateStudentDistribution_Success() {
        // Arrange
        ExerciseGroup group1 = mock(ExerciseGroup.class);
        ExerciseGroup group2 = mock(ExerciseGroup.class);
        Student student1 = mock(Student.class);
        Student student2 = mock(Student.class);
        Course course = new Course("Software Engineering", List.of(group1, group2));

        when(courseMock.getId()).thenReturn("Software Engineering");
        when(courseMock.getExerciseGroups()).thenReturn(List.of(group1, group2));

        when(group1.getName()).thenReturn("Group 1");
        when(group1.getStudents()).thenReturn(List.of(student1));

        when(group2.getName()).thenReturn("Group 2");
        when(group2.getStudents()).thenReturn(List.of(student2));

        when(student1.getName()).thenReturn("Alice");
        when(student1.getMatriculationNumber()).thenReturn("A123");

        when(student2.getName()).thenReturn("Bob");
        when(student2.getMatriculationNumber()).thenReturn("B456");

        // Act
        courses.add(course);
        Map<String, List<String>> distribution = studentManager.generateStudentDistribution("Software Engineering");

        // Assert
        assertEquals(2, distribution.size());
        assertTrue(distribution.containsKey("Group 1"));
        assertTrue(distribution.containsKey("Group 2"));
        assertEquals(List.of("Alice (A123)"), distribution.get("Group 1"));
        assertEquals(List.of("Bob (B456)"), distribution.get("Group 2"));
    }

    @Test
    public void testGenerateStudentDistribution_CourseNotFound() {
        when(courseMock.getId()).thenReturn("Object-Oriented Software Engineering");;

        assertThrows(IllegalArgumentException.class, () -> studentManager.generateStudentDistribution("Software Engineering"));
    }
}
