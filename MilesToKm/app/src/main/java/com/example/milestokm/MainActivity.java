package com.example.milestokm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConvertM = findViewById(R.id.convertM);
        btnConvertM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtMile = (EditText) findViewById(R.id.editMile);
                EditText txtKilo = (EditText) findViewById(R.id.editKm);
                double vMile = Double.valueOf(txtMile.getText().toString());
                double vKm = vMile / 0.62137;
                DecimalFormat formatVal = new DecimalFormat ("##.##");
                txtKilo.setText(formatVal.format(vKm));
            }
        });
        Button btnConvertK = findViewById(R.id.convertK);
        btnConvertK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txtMile = (EditText) findViewById(R.id.editMile);
                EditText txtKilo = (EditText) findViewById(R.id.editKm);
                double vKm = Double.valueOf(txtKilo.getText().toString());
                double vMile = vKm * 0.62137;
                DecimalFormat formatVal = new DecimalFormat ("##.##");
                txtMile.setText(formatVal.format(vMile));
            }
        });

    }
}
