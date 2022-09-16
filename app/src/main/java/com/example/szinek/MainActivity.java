package com.example.szinek;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private RelativeLayout layout;
    private TextView text;
    private Random rand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int r = rand.nextInt(256);
                int g = rand.nextInt(256);
                int b = rand.nextInt(256);
                layout.setBackgroundColor(Color.rgb(r, g, b));
                String colorText = String.format("(%d, %d, %d)",r,g,b);
                text.setText(colorText);
            }
        });
    }

    private void init() {
        layout = findViewById(R.id.layout);
        text = findViewById(R.id.textSzin);
        rand = new Random();
    }
}