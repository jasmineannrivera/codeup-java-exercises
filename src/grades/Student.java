package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;


    //constructor for name and initialize grades as an empty ArrayList
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();

    }
    // returns the student's name
    public String getName(){
        return name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double average = 0.0;
        double sum = 0.0;
        for (Integer grade: grades) {
            sum += grade;
        }
        average = sum/grades.size();
        return average;

        }



    public static void main(String[] args) {
        Student me = new Student("Jasmine");
        me.addGrade(100);
        me.addGrade(99);
        me.addGrade(98);
        me.addGrade(97);
        me.addGrade(96);
        me.addGrade(95);
        System.out.println(me.grades);
        System.out.println("\nThe average grade is " + me.getGradeAverage());
    }

}
