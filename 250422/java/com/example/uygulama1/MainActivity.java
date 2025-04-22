package com.example.uygulama1;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Ulke> ulkeler;
    ListView lvUlkeler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        lvUlkeler=findViewById(R.id.lv_ulkeler);
        ulkeler=new ArrayList<>();
        ulkeler.add(new Ulke(R.drawable.turkiye,"Türkiye","Ankara",70000000,"TL","Türkçe","+90",getString(R.string.tr_aciklama)));
        ulkeler.add(new Ulke(R.drawable.almanya,"Almanya","Berlin",3000000,"Euro","Almanca","+49",getString(R.string.al_aciklama)));
        ulkeler.add(new Ulke(R.drawable.belcika,"Belçika","Brüksel",200000,"Euro","Fransızca","+32",getString(R.string.bl_aciklama)));
        ulkeler.add(new Ulke(R.drawable.kanada,"Kanada","Ottava",40000000,"Kanada doları","Fransızca","+1",getString(R.string.kn_aciklama)));


        UlkelerAdapter adapter=new UlkelerAdapter(ulkeler,this);
        lvUlkeler.setAdapter(adapter);









        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}