package it.unibo.composition;

public class Professor implements User {
    
    private static final String DOT = ".";

    private int id;
    private String name;
    private String surname;
    private String password;
    private String[] courses;

    public Professor(int id, String name, String surname, String password, String[] courses) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public void replaceCourse(String course, int index){
        this.courses[index]=course;
    }

    public void replaceAllCourses(String[] courses){
        this.courses=courses;
    }

    public String getUsername() {
        return getName()+Professor.DOT+getSurname();
    }

    public String getDescription() {
        return toString();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
        
    @Override
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getCourses() {
        return this.courses;
    }

    public String toString() {
        return "Student ["
            + "name=" + this.name
            + ", surname=" + this.surname
            + ", id=" + this.id
            + ", courses=" + this.courses
            + "]";
    }
}
