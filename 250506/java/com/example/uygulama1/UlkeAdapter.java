package com.example.uygulama1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class UlkeAdapter extends BaseAdapter {

    Context context;

    ArrayList<Ulke> ulkeler;

    public UlkeAdapter(Context context, ArrayList<Ulke> ulkeler) {
        this.context = context;
        this.ulkeler = ulkeler;
    }

    @Override
    public int getCount() {
        return ulkeler.size();
    }

    @Override
    public Object getItem(int i) {
        return ulkeler.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //liste gürünümü olusturulur.

        ImageView ivSatirBayrak;
        TextView tvSatirAd,tvSatirBaskent,tvSatirNufus;
        Ulke ulke=ulkeler.get(i); //Sıradaki ülke nesnesi elde edilir.
        if (view == null){
            view=View.inflate(context,R.layout.satir,null);
        }

        //xml'de tanımlı bileşenler ayarlanır.
        ivSatirBayrak=view.findViewById(R.id.Iv_satir_bayrak);
        tvSatirAd=view.findViewById(R.id.tv_satir_ad);
        tvSatirBaskent=view.findViewById(R.id.tv_satir_baskent);
        tvSatirNufus=view.findViewById(R.id.tv_satir_nufus);

        //Her bilesene ülke nesnesinden alınan değer atanır.
        ivSatirBayrak.setImageResource(ulke.getBayrak());
        tvSatirAd.setText(ulke.getAd());
        tvSatirBaskent.setText(ulke.getBaskent());
        tvSatirNufus.setText("Nüfus :"+ulke.getNufus());


        return view;
    }


}
