package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText  etSayi1,etSayi2;
    Button buttonTopla,buttonCikar,buttonCarp,buttonBol;
    TextView tvSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etSayi1=findViewById(R.id.et_sayi1);
        etSayi2=findViewById(R.id.et_sayi2);
        buttonTopla=findViewById(R.id.button_topla);
        buttonCikar=findViewById(R.id.button_cikar);
        buttonCarp=findViewById(R.id.button_carp);
        buttonBol=findViewById(R.id.button_bol);
        tvSonuc=findViewById(R.id.tv_sonuc);

        buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int sayi1=Integer.parseInt(etSayi1.getText().toString());
                int sayi2=Integer.parseInt(etSayi2.getText().toString());
                int sonuc=sayi1+sayi2;
                tvSonuc.setText("Sonuç :"+sonuc);

            }
        });

        buttonCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(etSayi1.getText().toString());
                int sayi2=Integer.parseInt(etSayi2.getText().toString());
                int sonuc=sayi1-sayi2;
                tvSonuc.setText("Sonuç :"+sonuc);


            }
        });

        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(etSayi1.getText().toString());
                int sayi2=Integer.parseInt(etSayi2.getText().toString());
                int sonuc=sayi1*sayi2;
                tvSonuc.setText("Sonuç :"+sonuc);

            }
        });
        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayi1=Integer.parseInt(etSayi1.getText().toString());
                int sayi2=Integer.parseInt(etSayi2.getText().toString());
                int sonuc=sayi1/sayi2;
                tvSonuc.setText("Sonuç :"+sonuc);

            }
        });
    }
}