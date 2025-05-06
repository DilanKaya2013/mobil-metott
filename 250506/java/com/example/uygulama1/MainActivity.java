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

    ListView lvUlkeler;
    ArrayList<Ulke>liste;

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

        lvUlkeler=findViewById(R.id.lv_ulkeler);

        liste=new ArrayList<>();
        liste.add(new Ulke(R.drawable.danimarka,"Danimarka","Kopenhag",123456789,getString(R.string.aciklama_danimarka)));
        liste.add(new Ulke(R.drawable.brezilya,"Brezilya","Brüksel",123456789,getString(R.string.aciklama_brezilya)));
        liste.add(new Ulke(R.drawable.kanada,"Kanada","Ottava",123456789,getString(R.string.aciklama_kanada)));
        liste.add(new Ulke(R.drawable.somali,"Somali","Mogadişu",123456789,getString(R.string.aciklama_somali)));

        UlkeAdapter adapter=new UlkeAdapter(this,liste);
        lvUlkeler.setAdapter(adapter);

    }
}