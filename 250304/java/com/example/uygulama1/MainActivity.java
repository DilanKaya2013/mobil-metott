package com.example.uygulama1;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
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

        Gorsel cilek=new Gorsel("cilek",1,R.drawable.cilek);
        Gorsel coconut=new Gorsel("coconut",2,R.drawable.coconut);
        Gorsel elma=new Gorsel("elma",3,R.drawable.elma);
        Gorsel karpuz=new Gorsel("karpuz",4,R.drawable.karpuz);
        Gorsel muz=new Gorsel("muz",5,R.drawable.muz);
        Gorsel kiraz=new Gorsel("kiraz",6,R.drawable.kiraz);
        Gorsel kivi=new Gorsel("kivi",7,R.drawable.kivi);

        gorselArrayList.add(cilek);
        gorselArrayList.add(coconut);
        gorselArrayList.add(elma);
        gorselArrayList.add(karpuz);
        gorselArrayList.add(muz);
        gorselArrayList.add(kiraz);
        gorselArrayList.add(kivi);

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
