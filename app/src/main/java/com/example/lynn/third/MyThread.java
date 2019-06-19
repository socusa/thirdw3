package com.example.lynn.third;

public class MyThread implements Runnable {

    public MyThread() {
        Thread thread = new Thread(this);

        thread.start();
    }

    private void pause(double seconds) {
        try {
            Thread.sleep((int)(seconds*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

    }
}
