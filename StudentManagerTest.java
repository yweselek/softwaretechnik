package homework_mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StudentManagerTest {

    @Mock
    private List<Course> courses; // Mock der Kursliste

    @Mock
    private Course course; // Mock eines Kurses

    @Mock
    private ExerciseGroup group1; // Mock einer Übungsgruppe

    @Mock
    private ExerciseGroup group2; // Mock einer weiteren Übungsgruppe

    @Mock
    private Student student1; // Mock eines Studenten

    @Mock
    private Student student2; // Mock eines weiteren Studenten

    private StudentManager studentManager; // Die zu testende Klasse

    @BeforeEach
    public void setup() {
        // Initialisiere Mockito-Mocks
        MockitoAnnotations.openMocks(this);

        // Übergib die gemockte Kursliste an den Konstruktor von StudentManager
        studentManager = new StudentManager(null, courses);
    }

    @Test
    public void testGenerateStudentDistribution_Success() {
        // Konfiguriere Mock-Objekte für Studenten
        when(student1.getName()).thenReturn("Alice");
        when(student1.getMatriculationNumber()).thenReturn("A123");
        when(student2.getName()).thenReturn("Bob");
        when(student2.getMatriculationNumber()).thenReturn("B456");

        // Konfiguriere Mock-Objekte für Übungsgruppen
        when(group1.getName()).thenReturn("Group 1");
        when(group1.getStudents()).thenReturn(List.of(student1));
        when(group2.getName()).thenReturn("Group 2");
        when(group2.getStudents()).thenReturn(List.of(student2));

        // Mock der getId-Methode von Course, um einen eindeutigen Wert zurückzugeben
        when(course.getId()).thenReturn("Software Engineering");  // Hier wird "Software Engineering" als Kurs-ID zurückgegeben
        when(course.getExerciseGroups()).thenReturn(List.of(group1, group2));

        // Simuliere einen Stream, der den Kurs enthält
        when(courses.stream()).thenReturn(Stream.of(course)); // Liste simuliert einen Kurs

        // Act: Aufruf der Methode, die getestet wird
        Map<String, List<String>> distribution = studentManager.generateStudentDistribution("Software Engineering");

        // Assert: Überprüfe, ob die Gruppenzuteilung korrekt erfolgt ist
        assertEquals(2, distribution.size()); // Es gibt 2 Gruppen
        assertTrue(distribution.containsKey("Group 1")); // Gruppe 1 vorhanden
        assertTrue(distribution.containsKey("Group 2")); // Gruppe 2 vorhanden
        assertEquals(List.of("Alice (A123)"), distribution.get("Group 1")); // Details Gruppe 1
        assertEquals(List.of("Bob (B456)"), distribution.get("Group 2")); // Details Gruppe 2

        // Verifiziere Mock-Interaktionen
        verify(course, times(1)).getId();  // Überprüfe, ob getId aufgerufen wurde
        verify(course, times(1)).getExerciseGroups(); // Überprüfe, ob die Übungsgruppen abgerufen wurden
        verify(group1, times(1)).getName(); // Überprüfe, ob der Name der ersten Übungsgruppe abgerufen wurde
        verify(group1, times(1)).getStudents(); // Überprüfe, ob die Studenten der ersten Übungsgruppe abgerufen wurden
        verify(group2, times(1)).getName(); // Überprüfe, ob der Name der zweiten Übungsgruppe abgerufen wurde
        verify(group2, times(1)).getStudents(); // Überprüfe, ob die Studenten der zweiten Übungsgruppe abgerufen wurden
    }

    @Test
    public void testGenerateStudentDistribution_CourseNotFound() {
        // Konfiguriere die Mock-Kursliste, um einen leeren Stream zu simulieren (kein Kurs gefunden)
        when(courses.stream()).thenReturn(Stream.empty());

        // Act & Assert: Überprüfe, ob eine IllegalArgumentException geworfen wird, wenn der Kurs nicht gefunden wird
        assertThrows(IllegalArgumentException.class, () -> studentManager.generateStudentDistribution("Software Engineering"));

        // Verifiziere Mock-Interaktionen
        verify(courses, times(1)).stream(); // Überprüfe, ob stream() einmal aufgerufen wurde
    }
}
