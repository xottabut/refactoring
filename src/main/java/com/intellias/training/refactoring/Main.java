package com.intellias.training.refactoring;

import com.intellias.training.refactoring.data.Student;
import com.intellias.training.refactoring.data.StudentCreator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                StudentCreator.create("Sergii", 2000, 5),
                StudentCreator.create("Petro", 2000, 5),
                StudentCreator.create("Anna", 2001, 5),
                StudentCreator.create("Natasha", 2002, 5)
        );

        UnsafeRefactoring.extractVariableExample(students, 2000);
        UnsafeRefactoring.extractVariableExample(students, 1999);

    }

    private static void testCondition() {
        ConditionRefactoring conditionRefactoring = new ConditionRefactoring();
        conditionRefactoring.inverseBooleanExample(null);
    }

}
