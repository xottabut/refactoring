package com.intellias.training.refactoring;

import org.locationtech.jts.geom.LineString;

public class SimpleRefactorings {

    public static void main(String[] args) {
        SimpleRefactorings refactorings = new SimpleRefactorings();
        double factor = refactorings.calculateFacttor(null);
    }

    public double calculateFacttor(LineString lineString) { // rename
        if (lineString == null) {
            return 0.0; // extract to parameter
        }
        if (lineString.getLength() == 0) { // extract variable
            return -1.0;
        }
        System.out.println("Line String: " + lineString);
        return lineString.getLength();
    }

    public void process(LineString lineString) {
        System.out.println("Line String: " + lineString); // extract constant
    }

}
