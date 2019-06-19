package com.example.lynn.third;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TableRow;

import static com.example.lynn.third.MainActivity.*;

public class MyView extends RelativeLayout {

    public void scramble(int[] input) {
        for (int counter=0;counter<100;counter++) {
            int position1 = (int)(input.length*Math.random());

            int position2 = (int)(input.length*Math.random());

            int temp = input[position1];
            input[position1] = input[position2];
            input[position2] = temp;
        }
    }

    public MyView(Context context) {
        super(context);

        Point sizeOfScreen = Util.sizeOfScreen(context);

        width = sizeOfScreen.x;
        height = sizeOfScreen.y;

        changeColors = new ChangeColors();

        int[] drawables = {R.drawable.bear,
                           R.drawable.bird,
                           R.drawable.cat,
                           R.drawable.cow,
                           R.drawable.eagle,
                           R.drawable.elephant,
                           R.drawable.lioness,
                           R.drawable.llama,
                           R.drawable.panda,
                           R.drawable.pig,
                           R.drawable.rabbit,
                           R.drawable.rhino,
                           R.drawable.rooster,
                           R.drawable.sheep,
                           R.drawable.snake,
                           R.drawable.tiger,
                           R.drawable.turtle,
                           R.drawable.zebra,
                           R.drawable.bear,
                           R.drawable.bird,
                           R.drawable.cat,
                           R.drawable.cow,
                           R.drawable.eagle,
                           R.drawable.elephant,
                           R.drawable.lioness,
                           R.drawable.llama,
                           R.drawable.panda,
                           R.drawable.pig,
                           R.drawable.rabbit,
                           R.drawable.rhino,
                           R.drawable.rooster,
                           R.drawable.sheep,
                           R.drawable.snake,
                           R.drawable.tiger,
                           R.drawable.turtle,
                           R.drawable.zebra};

        scramble(drawables);

        x = getResources().getDrawable(R.drawable.x);

        images = new ImageView[36];

        for(int counter=0;counter<images.length;counter++) {
            images[counter] = new ImageView(context);

            images[counter].setTag("" + drawables[counter]);

            images[counter].setImageDrawable(x);

            images[counter].setOnClickListener(listener);
        }

        TableLayout table = new TableLayout(context);

        table.setId(View.generateViewId());

        int index = 0;

        for (int counter=0;counter<6;counter++) {
            TableRow row = new TableRow(context);

            for (int counter1=0;counter1<6;counter1++) {
                TableRow.LayoutParams params = new TableRow.LayoutParams(160,160);

                images[index].setLayoutParams(params);

                row.addView(images[index]);

                index++;
            }


        }
    }

}
