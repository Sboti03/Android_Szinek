package com.example.colors;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.slider.Slider;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout layout;
    private TextView szinezo;
    private Slider redSlide;
    private Slider greenSlide;
    private Slider blueSlide;
    private TextView redText;
    private TextView greenText;
    private TextView blueText;

    private int red = 0;
    private int green = 0;
    private int blue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        Init();
        redSlide.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                redText.setText("Red: " + (int) value);
                red = (int)value;
                changeColor();
            }
        });

        greenSlide.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                greenText.setText("Green: " + (int) value);
                green = (int)value;
                changeColor();
            }
        });

        blueSlide.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(@NonNull Slider slider, float value, boolean fromUser) {
                blueText.setText("Blue: " + (int) value);
                blue = (int)value;
                changeColor();
            }
        });
    }

    private void changeColor() {
        szinezo.setBackgroundColor(Color.rgb(red, green, blue));
        if ((red + blue + green) > 400){
            szinezo.setTextColor(Color.BLACK);
        } else {
            szinezo.setTextColor(Color.WHITE);
        }
        szinezo.setText(String.format("(%d, %d, %d", red, green, blue));
    }


    private void Init() {
        layout = findViewById(R.id.layout);
        szinezo = findViewById(R.id.textSzin);

        redSlide = findViewById(R.id.redSlider);
        greenSlide = findViewById(R.id.greenSlider);
        blueSlide = findViewById(R.id.blueSlider);

        redText = findViewById(R.id.redText);
        greenText = findViewById(R.id.greenText);
        blueText = findViewById(R.id.blueText);

        redSlide.setValueFrom(0);
        redSlide.setValueTo(255);
        redSlide.setStepSize(1);

        greenSlide.setValueFrom(0);
        greenSlide.setValueTo(255);
        greenSlide.setStepSize(1);

        blueSlide.setValueFrom(0);
        blueSlide.setValueTo(255);
        blueSlide.setStepSize(1);
    }


}
