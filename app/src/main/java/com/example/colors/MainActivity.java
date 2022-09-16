package com.example.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
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
        Random rnd = new Random();

        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int red = rnd.nextInt(256);
                int green = rnd.nextInt(256);
                int blue = rnd.nextInt(256);
                layout.setBackgroundColor(Color.rgb(red, green, blue));
                String szoveges = String.format("(%d, %d, %d)", red, green, blue);
                szoveg.setText(szoveges);
            }
        });
    }

    private void Init() {
        layout = findViewById(R.id.layout);
        szoveg = findViewById(R.id.textSzin);
    }


}
