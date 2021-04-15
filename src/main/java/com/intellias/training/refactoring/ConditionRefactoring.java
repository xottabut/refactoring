package com.intellias.training.refactoring;

import com.intellias.training.refactoring.data.University;

public class ConditionRefactoring {

    // Step 1: extract complex condition to separate method: hasEnoughStudents
    // Step 2: invert boolean
    // Step 3: invert condition
    // Step 4: remove parentheses
    // Step 5: extract interface
    public void inverseBooleanExample(University university) {
        // ...
        if ((university == null) || university.getStudents().size() < 2) {
            System.out.println("No report generated.");
        } else {
            System.out.println("University has " + university.getStudents().size() + " students.");
        }
        // ...
    }

}
