package com.sahil4.multiplicationtable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tableBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button getButton = findViewById(R.id.getButton);
        tableBox = findViewById(R.id.textView4);
        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editTextNumber2 = findViewById(R.id.editTextNumber2);
                try {
                    String ss = editTextNumber2.getText().toString();
                    int n = Integer.parseInt(ss);
                    generateTable(n);
                } catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Please Enter a Valid Integer Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void generateTable(int TableNumber) {
        String s;
        tableBox.setText("\n");
        for (int i = 1; i < 11; i++) {
            s = String.valueOf(TableNumber) + " X " + i + " = " + String.valueOf(TableNumber * i) + "\n";
            tableBox.append(s);
        }
    }

}