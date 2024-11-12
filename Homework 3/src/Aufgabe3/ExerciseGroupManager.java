package Aufgabe3;

public class ExerciseGroupManager {

    public static int checkGroupCapacities(int totalStudents, int groupSize, int availableGroups) throws IllegalArgumentException {
        if(groupSize <= 0 || availableGroups <= 0){
            throw new IllegalArgumentException();
        } else {
            if(totalStudents <= 0){
                return 0;
            } else {
                int maxCapacity = groupSize * availableGroups;
                return totalStudents - maxCapacity;
            }
        }
    }



}
