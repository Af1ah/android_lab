package com.example.changebg;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.button);
        int[] colors = {
                Color.RED,
                Color.BLUE,
                Color.GREEN,
                Color.YELLOW,
                Color.MAGENTA
        };
        Random ran = new Random();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ConstraintLayout l = findViewById(R.id.main);
               int rclr = colors[ran.nextInt(colors.length)];
               l.setBackgroundColor(rclr);
            }
        });
    }

}