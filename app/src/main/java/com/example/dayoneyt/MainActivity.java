package com.example.dayoneyt;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 private Button button;
 private EditText kg;
 private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        kg = findViewById(R.id.editTextNumber);
        text = findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "IT Works", Toast.LENGTH_SHORT).show();
                String s= kg.getText().toString();
                int kilogram = Integer.parseInt(s);
                double pound = 2.205 * kilogram;
               text.setText("The Corresponding value in pound is" + pound);


            }
        });
    }
}