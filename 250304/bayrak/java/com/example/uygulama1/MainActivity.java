package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.uygulama1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    ArrayList<Gorsel> gorselArrayList;

    int seciliSiraNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding =ActivityMainBinding.inflate(getLayoutInflater());
       View view = binding.getRoot();
        setContentView(view);
        gorselArrayList=new ArrayList<>();

        Gorsel turkey=new Gorsel("turkey",1,R.drawable.turkey);
        Gorsel australia=new Gorsel("australia",2,R.drawable.australia);
        Gorsel brazil=new Gorsel("brazil",3,R.drawable.brazil);
        Gorsel canada=new Gorsel("canada",4,R.drawable.canada);
        Gorsel germany=new Gorsel("germany",5,R.drawable.germany);
        Gorsel italy=new Gorsel("italy",6,R.drawable.italy);
        Gorsel scotland=new Gorsel("scotland",7,R.drawable.scotland);
        Gorsel spain=new Gorsel("spain",8,R.drawable.spain);
        Gorsel sweden=new Gorsel("scotland",9,R.drawable.sweden);
        Gorsel tunusia=new Gorsel("scotland",10,R.drawable.tunusia);

        gorselArrayList.add(turkey);
        gorselArrayList.add(australia);
        gorselArrayList.add(brazil);
        gorselArrayList.add(canada);
        gorselArrayList.add(germany);
        gorselArrayList.add(italy);
        gorselArrayList.add(scotland);
        gorselArrayList.add(spain);
        gorselArrayList.add(sweden);
        gorselArrayList.add(tunusia);


        binding.imageViewGorsel.setImageResource(gorselArrayList.get(0).foto);
        binding.textView.setText("Bilgi :"+ gorselArrayList.get(0).bilgi);
        seciliSiraNo=0;
    }
        public void geriGelme(View view){
            if(seciliSiraNo>0){
                seciliSiraNo--;
                binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);

                binding.textView.setText("Bilgi:"+gorselArrayList.get(seciliSiraNo).bilgi);
            }
        }
         public void ileriGitme(View view){
            if(seciliSiraNo<gorselArrayList.size()-1){
            seciliSiraNo++;
            binding.imageViewGorsel.setImageResource(gorselArrayList.get(seciliSiraNo).foto);

            binding.textView.setText("Bilgi:"+gorselArrayList.get(seciliSiraNo).bilgi);
        }
    }



    }
