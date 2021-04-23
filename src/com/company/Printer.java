package com.company;

public class Printer {
    public static synchronized void printLanguage(String name){
            System.out.println(name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }
}
