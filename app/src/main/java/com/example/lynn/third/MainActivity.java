package com.example.lynn.third;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public static MyView myView;
    public static MyListener listener = new MyListener();
    public static ChangeColors changeColors;
    public static ImageView[] images;
    public static Drawable x;
    public static int width;
    public static int height;
    public static int score;
    public static ImageView first;
    public static ImageView second;
    public static boolean ready = true;
    public static ScoreView scoreView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(myView = new MyView(this));
    }
}
