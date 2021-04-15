package com.intellias.training.refactoring;

import java.util.Arrays;
import java.util.List;

public class InlineRefactoring {

    public static final List<String> NAMES = Arrays.asList("Ivan", "", "\"Max\"");

    public void inline() {
        String paramA = calculateParamA();
        // ...
        System.out.println(paramA);


        for (String name : NAMES) {
            System.out.println(calculateFactor(name));
        }

        for (String NAME : NAMES) {
            processName(NAME);
        }

    }

    private String calculateParamA() {
        if (System.currentTimeMillis() % 2 == 0) {
            return "first";
        } else {
            return "second";
        }
    }

    private int calculateFactor(String name) {
        if (name == null || name.isEmpty()) {
            return 0;
        }
        if (name.startsWith("\"") && name.endsWith("\"")) {
            return name.length() - 2;
        }
        return name.length();
    }

    private void processName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return;
        }
        if (name.startsWith("\"") && name.endsWith("\"")) {
            name = name.substring(1, name.length() - 1).trim();
        }
        if (name.isEmpty()) {
            return;
        }
        System.out.println("Length: " + name.length() + " -> " + name);
    }

}
