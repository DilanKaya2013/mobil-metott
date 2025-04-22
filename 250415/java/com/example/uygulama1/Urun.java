package com.example.uygulama1;

public class Urun {
    int id;
    String ad;
    int stokMiktari;
    double fiyat;
    boolean stokDurum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public boolean isStokDurum() {
        return stokDurum;
    }

    public void setStokDurum(boolean stokDurum) {
        this.stokDurum = stokDurum;
    }

    public Urun(int id, String ad, int stokMiktari, double fiyat, boolean stokDurum) {
        this.id = id;
        this.ad = ad;
        this.stokMiktari = stokMiktari;
        this.fiyat = fiyat;
        this.stokDurum = stokDurum;
    }


}
