package Homework3.Aufgabe3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ExerciseGroupManagerTest {
  @Test
    public void test1(){
      assertThrows(IllegalArgumentException.class, () -> ExerciseGroupManager.checkGroupCapacities(100, 0, 5));
  }

  @Test
  public void test2(){
      assertEquals(0, ExerciseGroupManager.checkGroupCapacities(0, 30, 5));
  }
  @Test
    public void test3(){
      assertThrows(IllegalArgumentException.class, () -> ExerciseGroupManager.checkGroupCapacities(100, 10, -3));
  }

  @Test
    public void test4(){
      assertEquals(50, ExerciseGroupManager.checkGroupCapacities(100, 10, 5));
  }
  @Test
  public void test5(){
      assertEquals(-40, ExerciseGroupManager.checkGroupCapacities(10, 10, 5));
  }
}