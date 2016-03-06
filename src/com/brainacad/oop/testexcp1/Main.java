package com.brainacad.oop.testexcp1;


public class Main {
    public static void main(String[] args) {

        MyTest myTest = null;

        try {
            myTest.test();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I was here!");
        }
    }
}
