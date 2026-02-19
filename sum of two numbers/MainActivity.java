package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btnHello = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextText);
        EditText editText2 = findViewById(R.id.editTextText2);

        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int st = Integer.parseInt(editText.getText().toString());
                int st2 = Integer.parseInt(editText2.getText().toString());

                int sum = st + st2;

                String tx = "Sum of " + st + " and " + st2 + " = " + sum;

                Toast.makeText(MainActivity.this,
                        tx,
                        Toast.LENGTH_SHORT).show();
            }
        });



    }
}