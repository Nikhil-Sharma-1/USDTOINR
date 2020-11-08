package com.example.dollartoinr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        EditText dollarAmount = findViewById(R.id.dollarAmount);
        String dollar = dollarAmount.getText().toString();
        Double doubleDollar = Double.parseDouble(dollar);
        Double inr = doubleDollar*74.01;
        String toast = "Your Amount in INR is "+String.format("%.2f", inr);
        Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
    }
}