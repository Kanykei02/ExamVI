package com.company;

public class PrintLanguage implements Runnable{
    private String name;
    private Thread waitFor;

    public PrintLanguage(String name, Thread waitFor) {
        this.name = name;
        this.waitFor = waitFor;
    }

    @Override
    public void run() {
        if (waitFor != null) {
            try {
                waitFor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Printer.printLanguage(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Thread getWaitFor() {
        return waitFor;
    }

    public void setWaitFor(Thread waitFor) {
        this.waitFor = waitFor;
    }
}
