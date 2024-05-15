import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

    Student s1 = new Student(21, 1.85, "Arek", "Jabulani");
    Student s2 = new Student(22, 1.68, "Kasia", "Sianecka");
    Student s3 = new Student(19, 1.56, "Celina", "Jaworska");

    @Test
    public void arraysNotEqualAfterSorting() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        List<Student> studentList2 = studentList;
        System.out.println("Before sorting: " + studentList);
        Collections.sort(studentList2);
        System.out.println("After  sorting: " + studentList2);
        Assertions.assertNotSame(studentList, studentList2);
    }

    @Test
    public void arraysEqualBeforeSorting() {
        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        List<Student> studentList2 = studentList;

        Assertions.assertEquals(studentList2, studentList);
    }
}
