package com.intellias.training.refactoring.deprecated;

public class ClientUsesDeprecatedMethod {

    public static void main(String[] args) {
        Library library = new Library();

        library.iAmDeprecated();
        library.iAmVeryDeprecated();

    }

}
