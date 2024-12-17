package com.example.uygulama1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewTakim;

    RadioButton radioButtonBesiktas,radioButtonSamsunSpor,radioButtonJuventus,radioButtonChelsea;

    Button buttonSec;

    Button buttonSec;

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
            imageViewTakim=findViewById(R.id.imageView_takim);
        radioButtonBesiktas=findViewById(R.id.radioButton_besiktas);
        radioButtonSamsunSpor=findViewById(R.id.radioButton_samsunspor);
        radioButtonJuventus=findViewById(R.id.radioButton_juventus);
        radioButtonChelsea=findViewById(R.id.radioButton_chelsea);
        buttonSec=findViewById(R.id.button_sec);
        buttonSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(radioButtonBesiktas.isChecked()){

                    imageViewTakim.setImageResource(R.drawable.besiktas_logo);
                }

                else if(radioButtonSamsunSpor.isChecked()){

                    imageViewTakim.setImageResource(R.drawable.samsunspor_logo);

                } else if (radioButtonJuventus.isChecked()) {

                    imageViewTakim.setImageResource(R.drawable.juventus_logo);

                }

                else{

                    imageViewTakim.setImageResource(R.drawable.chelsea_logo);
                }

            }
        });
    }
}








    }
}