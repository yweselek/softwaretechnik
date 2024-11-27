package homework_mockito;
import Aufgabe1.ExerciseGroupManager;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

public class ExerciseGroupManagerTest {
    ExerciseGroupManager manager = new ExerciseGroupManager();
    @CsvSource({"2, 0, 3",
                "2, 3, 0"})
    @ParameterizedTest
    public void P1_should_return_Exception(int totalStudents, int groupSize, int availableGroups) {
        assertThrows(IllegalArgumentException.class, () -> manager.checkGroupCapacities(totalStudents, groupSize, availableGroups));

    }

    @CsvSource({"10, 10, 5",
            "10, 2147483647, 3"}) //Max int als Wert
    @ParameterizedTest
    public void P2_should_return_10(int totalStudents, int groupSize, int availableGroups) {
        assertEquals(10, manager.checkGroupCapacities(totalStudents, groupSize, availableGroups))   ;

    }

    @Test
    public void P3_should_return_0() {
        assertEquals(0, manager.checkGroupCapacities(0, 5, 5))   ;
    }

    @Test
    public void P4_should_return_2() {
        assertEquals(2, manager.checkGroupCapacities(Integer.MAX_VALUE, 2, 1));
    }

    @Test
    public void P4_should_return_20() {
        assertEquals(20, manager.checkGroupCapacities(20, 1, Integer.MAX_VALUE));
    }

    @Test
    public void P4_should_return_MaxInteger() {
        assertEquals(Integer.MAX_VALUE, manager.checkGroupCapacities(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void P5_should_return_1() {
        assertEquals(1, manager.checkGroupCapacities(1, 2, 3));
    }


}
