package com.intellias.training.refactoring;

import com.intellias.training.refactoring.data.Student;

public class ReturnRefactoring {

    public String extractScoreInStringNotation(Student student) {
        String stringNotation;
        if (student.getAverageNote() < 1) {
            stringNotation = "F";
        } else if (student.getAverageNote() < 2) {
            stringNotation = "D";
        } else if (student.getAverageNote() < 3) {
            stringNotation = "C";
        } else if (student.getAverageNote() < 4) {
            stringNotation = "B";
        } else {
            stringNotation = "A";
        }
        return stringNotation;
    }

}
