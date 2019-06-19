package com.example.lynn.third;

import android.view.View;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;

import static com.example.lynn.third.MainActivity.*;

public class MyListener implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        ImageView source = (ImageView)view;

        int id = Integer.parseInt(source.getTag().toString());

        if (first == null && ready) {
            first = source;

            first.setImageDrawable(ContextCompat.getDrawable(source.getContext(),id));
        } else if (ready) {
            second = source;

            second.setImageDrawable(ContextCompat.getDrawable(source.getContext(),id));

            ready = false;

            new MyThread();

        }

    }

}
