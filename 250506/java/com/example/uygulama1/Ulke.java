package com.example.uygulama1;

import java.io.Serializable;

public class Ulke implements Serializable {
    int bayrak;
    String ad;
    String baskent;
    int nufus;

    String aciklama;

    public Ulke(int bayrak, String ad, String baskent, int nufus, String aciklama) {
        this.bayrak = bayrak;
        this.ad = ad;
        this.baskent = baskent;
        this.nufus = nufus;
        this.aciklama = aciklama;
    }

    public int getBayrak() {
        return bayrak;
    }

    public void setBayrak(int bayrak) {
        this.bayrak = bayrak;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getBaskent() {
        return baskent;
    }

    public void setBaskent(String baskent) {
        this.baskent = baskent;
    }

    public int getNufus() {
        return nufus;
    }

    public void setNufus(int nufus) {
        this.nufus = nufus;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
