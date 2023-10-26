package it.unibo.composition;

public class Exam {

    private int id;
    private int maxStudents;
    private int registeredStudents;
    private String courseName;
    private Professor professor;
    private ExamRoom room;
    private Student[] students;

    public Exam(
        int id, 
        int maxStudents, 
        String courseName, 
        Professor professor, 
        ExamRoom room,
        Student[] students
    ) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
    }

    public void registerStudent(Student student){
        if(this.registeredStudents<this.getMaxStudents()){
            this.students[this.registeredStudents]=student;
            this.registeredStudents++;
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaxStudents() {
        return this.maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getRegisteredStudents() {
        return this.registeredStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Professor getProfessor() {
        return this.professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public ExamRoom getRoom() {
        return this.room;
    }

    public void setRoom(ExamRoom room) {
        this.room = room;
    }

    public Student[] getStudents() {
        return students;
    }

    public String toString() {
        return "Student ["
            + "courseName=" + this.courseName
            + ", id=" + this.id
            + ", maxStudents=" + this.maxStudents
            + ", registeredStudents=" + this.registeredStudents
            + ", professor=" + this.professor
            + ", room=" + this.room
            + ", students=" + this.students.toString()
            + "]";
    }    
}
