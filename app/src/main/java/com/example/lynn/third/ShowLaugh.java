package com.example.lynn.third;

import android.view.View;

import static com.example.lynn.third.MainActivity.*;

public class ShowLaugh implements Runnable {

    public ShowLaugh() {
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
        laugh.post(new Runnable() {

            @Override
            public void run() {
                 laugh.setVisibility(View.VISIBLE) ;
            }

        });

        pause(2);

        laugh.post(new Runnable() {

            @Override
            public void run() {
                laugh.setVisibility(View.INVISIBLE) ;
            }

        });

    }

}
