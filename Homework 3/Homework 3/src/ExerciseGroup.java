import java.util.ArrayList;

public class ExerciseGroup {
    private String groupID;
    private int maxCapacity;
    private String timeSlot;
    private ArrayList<Student> students = new ArrayList<Student>();
    public ExerciseGroup(String groupID, int maxCapacity, String timeSlot) {
        this.groupID = groupID;
        this.maxCapacity = maxCapacity;
        this.timeSlot = timeSlot;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
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
        if(students.size() < maxCapacity && !students.contains(student)) {
            students.add(student);
        }
    }
}
