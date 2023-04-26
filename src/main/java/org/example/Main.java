package org.example;

public class Main {
    public static void main(String[] args) {

        FileHelper fileHelper = new FileHelper();

        fileHelper.addPasswords();
        fileHelper.fileReader();

        for (String element: fileHelper.originalHashPasswordList) System.out.println(element);

        System.out.println("****-*-*-*--*--*-*-*-*-");

        for (String element: fileHelper.matchedPasswordList) System.out.println(element);


        System.out.println("Hello world!");
    }
}