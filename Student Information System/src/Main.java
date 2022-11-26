public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("Potions", "PTN301", "PTN");
        Course c2 = new Course("Transfiguration", "TFG301", "TFG");
        Course c3 = new Course("Defence Against Dark Arts", "DADA301", "DADA");

        Teacher t1 = new Teacher("Severus Snape", "PTN", "6666666666");
        Teacher t2 = new Teacher("Minerva McGonagall", "TFG", "3333333333");
        Teacher t3 = new Teacher("Remus Lupin", "DADA", "2222222222");

        c1.addTeacher(t1);
        c2.addTeacher(t2);
        c3.addTeacher(t3);

        Student s1 = new Student("Harry Potter", "7777777", "3", c1, c2, c3);
        s1.addBulkExamNote(40, 0, 70, 80,100, 100);
        s1.isPass();

        Student s2 = new Student("Ronald Weasley", "5555555", "3", c1, c2, c3);
        s2.addBulkExamNote(45, 20, 70, 70, 85, 85);
        s2.isPass();

        Student s3 = new Student("Hermione Granger", "1111111", "3", c1, c2, c3);
        s3.addBulkExamNote(100, 100, 100, 100, 100, 100);
        s3.isPass();
    }

}
