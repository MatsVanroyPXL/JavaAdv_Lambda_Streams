package be.pxl.ja.exercise1;

import be.pxl.ja.exercise1.Student;
import be.pxl.ja.exercise1.StudentList;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

public class StudentClass {

    public static void getStudentWithBirthday(List<Student> studentenList){
        studentenList.stream().filter(student -> student.getDateOfBirth().getMonth() == LocalDate.now().getMonth())
                .filter(student -> student.getDateOfBirth().getDayOfMonth() == LocalDate.now().getDayOfMonth()).forEach(student -> System.out.println(student.getName()));

    }

    public static void main(String[] args) {
        getStudentWithBirthday(StudentList.createStudents());
    }
}
