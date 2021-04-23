package com.company;

public class Main {

    public static void main(String[] args) {
        PrintLanguage printLanguage1 = new PrintLanguage("Java", null);
        Thread t1 = new Thread(printLanguage1);
        PrintLanguage printLanguage2 = new PrintLanguage("Python", t1);
        Thread t2 = new Thread(printLanguage2);
        PrintLanguage printLanguage3 = new PrintLanguage("Go", t2);
        Thread t3 = new Thread(printLanguage3);
        PrintLanguage printLanguage4 = new PrintLanguage("JavaScript", t3);
        Thread t4 = new Thread(printLanguage4);
        PrintLanguage printLanguage5 = new PrintLanguage("PHP", t4);
        Thread t5 = new Thread(printLanguage5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
