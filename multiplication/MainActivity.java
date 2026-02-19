package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        EditText editText = findViewById(R.id.editTextNumber);
        Button button = findViewById(R.id.button);
        TextView textViewResult = findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString();

                if (!input.isEmpty()) {
                    int num = Integer.parseInt(input);
                    StringBuilder table = new StringBuilder();


                    for (int i = 1; i <= 10; i++) {
                        table.append(num).append(" x ").append(i).append(" = ").append(num * i).append("\n");
                    }


                    textViewResult.setText(table.toString());
                } else {
                    editText.setError("Please enter a number");

                }
            }
        });
    }
}