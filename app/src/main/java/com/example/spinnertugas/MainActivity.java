package com.example.spinnertugas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] Item = {"Jakarta", "Depok", "Semarang", "Bandung"};

    TextView myTextView;

    EditText nama, alamat;
    RadioGroup myRadioGroup;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Spinner List = findViewById(R.id.listKota);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Item);
        List.setAdapter(adapter);
        nama = (EditText) findViewById(R.id.ETnama);
        alamat = (EditText) findViewById(R.id.ETalamat);
        myRadioGroup = (RadioGroup) findViewById(R.id.pilih_jk);
        myButton = (Button) findViewById(R.id.submitButton);
        myTextView = (TextView) findViewById(R.id.textCetak);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id_pilihan = myRadioGroup.getCheckedRadioButtonId();
                RadioButton pilih = (RadioButton) findViewById(id_pilihan);

                String hasilText = "Halo, " + nama.getText().toString() +
                        "\nAlamat :" + alamat.getText().toString() +
                        "\nKota :" + List.getSelectedItem().toString() +
                        "\nJenis Kelamin :" + pilih.getText().toString();

                Intent intent = new Intent(MainActivity.this, Hasil.class);

                intent.putExtra("hasilText", hasilText);

                startActivity(intent);
            }
        });
    }
}