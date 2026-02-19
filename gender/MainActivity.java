package com.example.gender;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radiogroup);
        submit = findViewById(R.id.button);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedId = radioGroup.getCheckedRadioButtonId();

                if (selectedId == -1) {
                    Toast.makeText(MainActivity.this,
                            "Please select a gender",
                            Toast.LENGTH_SHORT).show();
                } else {
                    RadioButton selectedRadio = findViewById(selectedId);
                    String gender = selectedRadio.getText().toString();

                    Toast.makeText(MainActivity.this,
                            "You selected: " + gender,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
