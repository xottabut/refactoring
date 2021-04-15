package com.intellias.training.refactoring;

import org.locationtech.jts.geom.LineString;

public class SimpleRefactorings {

    public static void main(String[] args) {
        SimpleRefactorings refactorings = new SimpleRefactorings();
        double factor = refactorings.calculateFactor(null);
    }

    public double calculateFactor(LineString lineString) {
        if (lineString == null) {
            return 0; // extract to parameter
        }
        return lineString.getLength();
    }

    public void process(LineString lineString) {

    }

}
