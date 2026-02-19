package com.example.checkboxes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        CheckBox pizza = (CheckBox) findViewById(R.id.checkBox3);
        CheckBox coffee = (CheckBox) findViewById(R.id.checkBox4);
        CheckBox burger = (CheckBox) findViewById(R.id.checkBox5);
        Button buttonOrder = (Button) findViewById(R.id.button);
        TextView resultText = (TextView) findViewById(R.id.textView3);

        buttonOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalamount = 0;
                StringBuilder result=new StringBuilder();
                result.append("selected items:");
                if(pizza.isChecked()){
                    result.append("\n pizza 100Rs");
                    totalamount+=100; 
                }
                if(coffee.isChecked()){
                    result.append("\n coffee 50Rs");
                    totalamount+=50;
                }
                if(burger.isChecked()){
                    result.append("\n burger 100Rs");
                    totalamount+=120;
                }
                result.append("\nTotal:"+totalamount+"Rs");
                resultText.setText(result.toString());


            }
        });

    }

}