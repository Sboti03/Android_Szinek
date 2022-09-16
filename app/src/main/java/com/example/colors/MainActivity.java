package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView szoveg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Init();
    }

    private void Init() {
        layout = findViewById(R.id.layout);
        szoveg = findViewById(R.id.textSzin);
    }


    private Color genColor() {
        Color randomColor = new Color();
        int r = (int) (Math.random() * 256);
        int g = (int) (Math.random() * 256);
        int b = (int) (Math.random() * 256);
        int a = (int) (Math.random() * 256);
        randomColor.alpha(a);
        randomColor.red(r);
        randomColor.green(g);
        randomColor.blue(b);
        return randomColor;
    }

    private void Timer(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                layout.setBackgroundColor();
            }
        }
        Timer timer = new Timer("Timer");

        long delay = 1000L;
        timer.schedule();

    }
}
