package Aufgabe1;

public class Lecture extends Course{
    String lID;
    String lectureName;
    public Lecture(String courseId, String name, String lID, String lectureName){
        super(courseId, name);
        this.lID = lID;
        this.lectureName = lectureName;
    }
    public String getLID(){
        return lID;
    }

    public void setLectureName(String lectureName) {
        this.lectureName = lectureName;
    }

    public String getlID() {
        return lID;
    }

    public void setlID(String lID) {
        this.lID = lID;
    }

    public String getLectureName(){
        return lectureName;
    }
}