
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Course mat = new Course("Matematik","MAT101","MAT");
        Course fizik = new Course("Fizik","FZK101","FZK");
        Course kimya = new Course("Kimya","KMY101","KMY");

        Teacher t1 = new Teacher("Mahmut Hoca","6347868798798","MAT");
        Teacher t2 = new Teacher("Fatma Ayşe","9897879879878","FZK");
        Teacher t3 = new Teacher("Ali Veli","8789787897877","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Hatice",4,"33432442",mat,fizik,kimya);
        s1.addBulkExamNote(50,30,20);
        s1.isPass();

        Student s2 = new Student("Derya",4,"33432442",mat,fizik,kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Mehlika",4,"33432442",mat,fizik,kimya);
        s3.addBulkExamNote(50,30,70);
        s3.isPass();
    }
}
