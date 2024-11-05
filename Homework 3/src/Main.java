import java.net.StandardSocketOptions;
import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManager<Lecturer> lecturerManager = new EntityManager<>();
        EntityManager<Student> studentManager = new EntityManager<>();
        EntityManager<Course> courseManager = new EntityManager<>();

        studentManager.addEntity(new Student("13", "sdwa", "wdqw"));
        studentManager.addEntity(new Student("14", "wdaw", "ads"));
        studentManager.addEntity(new Student("15", "sadwadaw", "awads"));

        lecturerManager.addEntity(new Lecturer("1", "sdwwadaa", "wdwadwwaqw"));
        lecturerManager.addEntity(new Lecturer("2", "sddwswadaa", "adsdwadwaadaa"));
        lecturerManager.addEntity(new Lecturer("3", "sddwswadwadwadaa", "adsddwadawadwaadwadaa"));

        courseManager.addEntity(new Course("dsaw", "1"));
        courseManager.addEntity(new Course("dsadwaw", "2"));
        courseManager.addEntity(new Course("dwadsaw", "3"));

        Predicate<Student> findStudentsById = (Student hilf) -> {
            if(hilf.getId().equals("13")){
                return true;
            } else {
                return false;
            }
        };

        Student foundStudentById = studentManager.getEntityByCriterion(findStudentsById);
        System.out.println(foundStudentById);

        Predicate<Lecturer> findLecturerByFirstName = (Lecturer hilf) -> {
            if(hilf.getFirstName().equals("sddwswadaa")){
                return true;
            } else {
                return false;
            }
        };
        System.out.println(lecturerManager.getEntityByCriterion(findLecturerByFirstName));

        Predicate<Course> findCourseByFirstCourseId = (Course hilf) -> {
            if(hilf.getCourseId().equals("2")){
                return true;
            } else {
                return false;
            }
        };
        System.out.println(courseManager.getEntityByCriterion(findCourseByFirstCourseId));

    }
}