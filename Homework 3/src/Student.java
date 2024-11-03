import java.util.ArrayList;

public class Student extends User{
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<ExerciseGroup> exerciseGroups = new ArrayList<>();
    public Student(String id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void registerCourse(Course pCourse) {
        if(!courses.contains(pCourse)) {
            courses.add(pCourse);
        }
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<ExerciseGroup> getExerciseGroups() {
        return exerciseGroups;
    }

    public void setExerciseGroups(ArrayList<ExerciseGroup> exerciseGroups) {
        this.exerciseGroups = exerciseGroups;
    }

    public void registerExerciseGroup(ExerciseGroup pExerciseGroup) {
        if(!exerciseGroups.contains(pExerciseGroup)) {
            pExerciseGroup.addStudent(this);
            if(pExerciseGroup.getStudents().size() < pExerciseGroup.getMaxCapacity()){
                exerciseGroups.add(pExerciseGroup);
            }
        }
    }

}
