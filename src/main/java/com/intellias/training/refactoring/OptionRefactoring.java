package com.intellias.training.refactoring;

import com.intellias.training.refactoring.data.Student;

import java.util.List;
import java.util.Optional;

public class OptionRefactoring {

    public void optionExample() {
        Optional<String> greeting = getGreeting();

        if (greeting.isPresent()) {
            System.out.println("greeting = " + greeting.get());
        }

    }

    public void processStudent(List<Student> students) {
        students.stream()
                .map(this::extractInfo)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }

    private Optional<String> extractInfo(Student student) {
        return Math.random() > 0.5 ? Optional.of(student.getFullName()) : Optional.empty();
    }

    private Optional<String> getGreeting() {
        return Optional.of("Hello!");
    }


}
