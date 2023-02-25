package com.example.efm_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOK;
    EditText poids, taille;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOK = findViewById(R.id.btn);
        poids = findViewById(R.id.poids);
        taille = findViewById(R.id.taille);

        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kg = Double.parseDouble(poids.getText().toString());
                double ta = Double.parseDouble(taille.getText().toString());
                double BMI = kg/703 * (ta*ta);

                if (BMI<18.5){
                    Toast.makeText(MainActivity.this, "Maigreur", Toast.LENGTH_SHORT).show();
                }
                if (BMI>=18.5 && BMI<25){
                    Toast.makeText(MainActivity.this, "Normale", Toast.LENGTH_SHORT).show();
                }
                if (BMI>=25 && BMI<40){
                    Toast.makeText(MainActivity.this, "Surpoids", Toast.LENGTH_SHORT).show();
                }if (BMI>=40){
                    Toast.makeText(MainActivity.this, "Obésité", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}