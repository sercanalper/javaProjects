public class Student {
    Course c1, c2, c3;
    String name, stuNo, classes;
    double average = 0;
    boolean isPass;
    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAverage();
        this.isPass = false;
    }
    void addBulkExamNote(int note1, int verbal1, int note2, int verbal2, int note3, int verbal3) {
        if(note1 > 0 && note1 <= 100)
            c1.note = note1;
        if(verbal1 > 0 && verbal1 <= 100)
            c1.verbal = verbal1;
        if(note2 > 0 && note2 <= 100)
            c2.note = note2;
        if(verbal2 > 0 && verbal2 <= 100)
            c2.verbal = verbal2;
        if(note3 > 0 && note3 <= 100)
            c3.note = note3;
        if(verbal3 > 0 && verbal3 <= 100)
            c3.verbal = verbal3;
    }
    void calcAverage() {this.average = ((this.c1.note * 0.8 + this.c1.verbal * 0.2) + (this.c2.note * 0.8 + this.c2.verbal * 0.2) + (this.c3.note * 0.8 + this.c3.verbal * 0.2)) / 3.0;}
    boolean isCheckPass() {
        calcAverage();
        return this.average > 55;
    }
    void isPass() {
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Average: " + this.average);
        if(this.isPass) {
            System.out.println("Passed.");
        } else {
            System.out.println("Failed.");
        }
    }
    void printNote() {
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        System.out.println("Student: " + this.name);
        System.out.println("Potions Note: " + this.c1.note + "\t\t\t\t\t\tVerbal: " + this.c1.verbal);
        System.out.println("Transfiguration Note: " + this.c2.note + "\t\t\t\tVerbal: " + this.c2.verbal);
        System.out.println("Defence Against Dark Arts Note: " + this.c3.note + "\t\tVerbal: " + this.c3.verbal);

    }

}
