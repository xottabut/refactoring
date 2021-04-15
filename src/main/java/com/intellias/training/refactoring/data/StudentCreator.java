package com.intellias.training.refactoring.data;

public final class StudentCreator {
    private StudentCreator() {
    }

    public static Student create(String fullName, int birthYear, double averageNote) {
        return new Student(fullName, birthYear, averageNote);
    }
}
