package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnCalistir,btnYavasla,btnHizlan,btnDurdur;
    private TextView tvDurum;
    private Araba araba;
    String durum="";//Global olarak tanımladık.Durum bilgisinde kullanacagız.

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

        araba=new Araba("Toyota", "Carolla", 228);
        durum="durum:\n"+araba.getMarka()+"\n"+araba.getModel()+"\n"+araba.getSonHiz()+"\n";
        btnCalistir=findViewById(R.id.btn_calistir);
        btnDurdur=findViewById(R.id.btn_durdur);
        btnHizlan=findViewById(R.id.btn_hizlan);
        btnYavasla=findViewById(R.id.btn_yavasla);
        tvDurum=findViewById(R.id.tv_durum);


        btnCalistir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnDurdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvDurum.setText(durum+araba.durdur());

            }
        });

        btnHizlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.hizlan(20);//parametre olarak verdiğimiz deger kadar hız artar.
                tvDurum.setText(durum+"Arabanın hızı:"+araba.getAnlikHiz()+"km/h");

            }
        });

        btnYavasla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                araba.yavasla(10);
                tvDurum.setText(durum+"Arabanın hızı:"+araba.getAnlikHiz()+"km/h");

            }
        });

    }
}