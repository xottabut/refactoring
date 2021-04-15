package com.intellias.training.refactoring;

import com.intellias.training.refactoring.data.Student;
import com.intellias.training.refactoring.data.StudentCreator;

import java.util.Arrays;
import java.util.List;

public class StreamRefactoring {

    public void streamToLoop(List<Student> students) {
        students.stream()
                .filter(student -> student.getAverageNote() > 4)
                .map(student -> "best:" + student.getFullName())
                .filter(s -> s.contains("Ivan"))
                .forEach(System.out::println);
    }

    public boolean mergeFilters(List<Student> students) {
        return students.stream()
                .filter(student -> student.getAverageNote() > 4)
                .filter(student -> student.getAverageNote() < 4.5)
                .anyMatch(s -> s.getBirthYear() > 2000);
    }

    public void forToStream() {
        Student a = StudentCreator.create("A", 2000, 5);
        Student b = StudentCreator.create("B", 2000, 4);

        List<Student> students = Arrays.asList(a, b);

        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageNote();
        }

        System.out.println(sum);
    }

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

}
