package com.intellias.training.refactoring;

import com.intellias.training.refactoring.data.Student;

import java.util.List;
import java.util.stream.Collectors;

public class UnsafeRefactoring {

    private static final int NTH_STUDENT = 1;

    private UnsafeRefactoring() {
    }

    public static void extractVariableExample(List<Student> students, int year) {
        List<Student> studentsOfYear = students.stream()
                .filter(student -> student.getBirthYear() == year)
                .collect(Collectors.toList());

        if (studentsOfYear.size() > NTH_STUDENT) {
            Student student = studentsOfYear.get(NTH_STUDENT);
            System.out.println("Step 1: student = " + student);
        }

        studentsOfYear.forEach(student -> System.out.println(student.getFullName()));

        if (studentsOfYear.size() > NTH_STUDENT) {
            Student student = studentsOfYear.get(NTH_STUDENT);
            System.out.println("Step 2: student = " + student);
        }
    }

}
