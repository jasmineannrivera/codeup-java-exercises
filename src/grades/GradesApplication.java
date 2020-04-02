package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student student = new Student("Mary");
        String key = "https://www.github/some-git-repo";
        student.addGrade(97);
        student.addGrade(100);
        student.addGrade(100);
        student.addGrade(100);
        students.put(key, student);
        student = new Student("Bill");
        key = "https://www.github/another-git-repo";
        student.addGrade(100);
        student.addGrade(90);
        student.addGrade(80);
        student.addGrade(70);
        students.put(key, student);
        student = new Student("Jim");
        key = "https://www.github/here-git-repo";
        student.addGrade(75);
        student.addGrade(85);
        student.addGrade(95);
        student.addGrade(100);
        students.put(key, student);
        student = new Student("Bob");
        key = "https://www.github/yup-git-repo";
        student.addGrade(82);
        student.addGrade(77);
        student.addGrade(96);
        student.addGrade(94);
        students.put(key, student);
        System.out.println(students);
    }

}
