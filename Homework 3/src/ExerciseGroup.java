import java.util.ArrayList;

public class ExerciseGroup {
    private String groupID;
    private int maxCapacity;
    private String timeSlot;
    private Student[] registeredStudents;
    public ExerciseGroup(String groupID, int maxCapacity, String timeSlot) {
        this.groupID = groupID;
        this.maxCapacity = maxCapacity;
        this.timeSlot = timeSlot;
        registeredStudents = new Student[maxCapacity];
    }

    public Student[] getRegisteredStudents() {
        return registeredStudents;
    }

    public void setRegisteredStudents(Student[] registeredStudents) {
        this.registeredStudents = registeredStudents;
    }

    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public String getGroupID() {
        return groupID;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < registeredStudents.length; i++) {
            if (registeredStudents[i] != student && registeredStudents[i] == null) {
                registeredStudents[i] = student;
            }
        }
    }
}