package com.example.lynn.third;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

import static com.example.lynn.third.MainActivity.*;

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

    private void fade(View view) {

    }

    @Override
    public void run() {
        pause(3);

        final boolean same = first.getTag().equals(second.getTag());

        myView.post(new Runnable() {

            @Override
            public void run() {
                if (same) {
       //             first.setVisibility(View.INVISIBLE);
       //             second.setVisibility(View.INVISIBLE);

                    fade(first);
                    fade(second);

                    score += 5;
                } else {
                    first.setImageDrawable(x);
                    second.setImageDrawable(x);

                    score -= 1000;

                    new ShowLaugh();
                }

                first = null;

                ready = true;

                scoreView.show();
            }
        });

    }
}
