package com.intellias.training.refactoring;

import com.intellias.training.refactoring.data.Student;
import com.intellias.training.refactoring.data.StudentCreator;

import java.util.Arrays;
import java.util.List;

public class LoopRefactoring {

    public void unrollFor() {
        Student a = StudentCreator.create("A", 2000, 5);
        Student b = StudentCreator.create("B", 2000, 4);

        List<Student> students = Arrays.asList(a, b);

        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageNote();
        }

        System.out.println(sum);
    }

    public void forRefactoring(List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
