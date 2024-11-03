import java.net.StandardSocketOptions;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManager<Student> studentManager = new EntityManager<>();
        studentManager.addEntity(new Student("13", "sdwa", "wdqw"));
        studentManager.addEntity(new Student("14", "wdaw", "ads"));
        studentManager.addEntity(new Student("15", "sadwadaw", "awads"));
        System.out.println(studentManager.getAllEntities());
        System.out.println(studentManager.getEntityById("14"));
        EntityManager<Lecturer> lecturerManager = new EntityManager<>();
        lecturerManager.addEntity(new Lecturer("1", "sdwwadaa", "wdwadwwaqw"));
        lecturerManager.addEntity(new Lecturer("2", "sddwswadaa", "adsdwadwaadaa"));
        lecturerManager.addEntity(new Lecturer("3", "sddwswadwadwadaa", "adsddwadawadwaadwadaa"));
        System.out.println(lecturerManager.getAllEntities());
        System.out.println(lecturerManager.getEntityById("3"));
        EntityManager<Course> courseManager = new EntityManager<>();
        courseManager.addEntity(new Course("dsaw", "1"));
        courseManager.addEntity(new Course("dsadwaw", "2"));
        courseManager.addEntity(new Course("dwadsaw", "3"));
        courseManager.getEntityById("2");
        System.out.println(courseManager.getAllEntities());
        System.out.println(courseManager.getEntityById("2"));

    }
}