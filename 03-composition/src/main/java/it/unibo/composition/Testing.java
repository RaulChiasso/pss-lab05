package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student andreaRossi = new Student(
                                1, 
                                "Andrea",
                                "Rossi", 
                                "andrearossi1",
                                2023);
        Student alexBianchi = new Student(
                                2, 
                                "Alex",
                                "Bianchi", 
                                "alexbianchi2", 
                                2023);
        Student marcoVerdi = new Student(
                                3, 
                                "Marco",
                                "Verdi", 
                                "marcoverdi3",
                                2022);

        // 2)Creare 2 docenti a piacere
        Professor angeloFilaseta = new Professor(
                                    2,
                                    "Angelo",
                                    "Filaseta",
                                    "angelofilseta2",
                                    new String[]{"PSS"});
        Professor robertoCasadei = new Professor(
                                    1,
                                    "Roberto",
                                    "Casadei", 
                                    "robertocasadei1", 
                                    new String[]{"Algoritmi"});

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room1 = new ExamRoom(
                            100,
                            "A1",
                            true, 
                            false);
        ExamRoom room2 = new ExamRoom(
                            80, 
                            "A2", 
                            true, 
                            true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
        Exam exam1 = new Exam(
                        1, 
                        10, 
                        "PSS", 
                        angeloFilaseta, 
                        room1);
        Exam exam2 = new Exam(
                        2, 
                        2, 
                        "Algoritmi", 
                        robertoCasadei, 
                        room2);

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        exam1.registerStudent(andreaRossi);
        exam1.registerStudent(alexBianchi);
        exam1.registerStudent(marcoVerdi);

        exam2.registerStudent(andreaRossi);
        exam2.registerStudent(alexBianchi);
        exam2.registerStudent(marcoVerdi);

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(exam1.toString());
        System.out.println(exam2.toString());
    }
}
