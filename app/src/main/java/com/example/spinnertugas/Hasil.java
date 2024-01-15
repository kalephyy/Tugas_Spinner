package com.example.spinnertugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);


        Intent intent = getIntent();
        String hasilText = intent.getStringExtra("hasilText");


        TextView hasilTextView = findViewById(R.id.hasilTextView);
        hasilTextView.setText(hasilText);
    }
}
