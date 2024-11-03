import java.util.ArrayList;



public class Course {
    private String name;
    private String courseId;
    private ArrayList<ExerciseGroup> exerciseGroups = new ArrayList<>();

    public Course(String name, String courseId) {
        this.name = name;
        this.courseId = courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public ArrayList<ExerciseGroup> getExerciseGroups() {
        return exerciseGroups;
    }

    public void setExerciseGroups(ArrayList<ExerciseGroup> exerciseGroups) {
        this.exerciseGroups = exerciseGroups;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCourseId() {
        return courseId;
    }

    public void addExerciseGroup(ExerciseGroup exerciseGroup) {
        if(!exerciseGroups.contains(exerciseGroup)) {
            exerciseGroups.add(exerciseGroup);
        }
    }
}
