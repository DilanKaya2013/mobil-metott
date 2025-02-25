package com.example.uygulama1;

public class Araba {
    private String marka;
    private String model ;
    private int sonHiz;
    private int anlikHiz;
    private boolean calisiyorMu;

    public String getMarka() {
        return marka;

}
    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSonHiz() {
        return sonHiz;
    }

    public void setSonHiz(int sonHiz) {
        this.sonHiz = sonHiz;
    }

    public int getAnlikHiz() {
        return anlikHiz;
    }

    public void setAnlikHiz(int anlikHiz) {
        if(anlikHiz<=0){
            this.anlikHiz=0;
        }
        else if (anlikHiz>sonHiz){
            this.anlikHiz = sonHiz;
        }

        else {
            this.anlikHiz=anlikHiz;
        }

    }


    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

    public void setCalisiyorMu(boolean calisiyorMu) {
        this.calisiyorMu = calisiyorMu;
    }

    public Araba(String marka, String model, int sonHiz) {
        this.marka = marka;
        this.model = model;
        this.sonHiz = sonHiz;
        this.anlikHiz=0;
        this.calisiyorMu=false;
    }

//fonsksiyonlarınız olusturalım.4 adet fonksiyon olusturuldu

    public String calistir(){
        if(calisiyorMu){
            return "araba zaten calısıyor";
        }
        calisiyorMu=true;
        return "araba calıstırıldı";

    }
    public String durdur(){
        if(anlikHiz>0){
            return"arabanın hızı: "+anlikHiz+"km/h oldugu icin durdurulmadı.";
        }
        if(calisiyorMu){
            calisiyorMu=false;
            return "arba durdurulu";

        }
        else{
            return "araba zaten durdurlmus";

        }
    }
    public void hizlan(int hiz){
        if(calisiyorMu){
            setAnlikHiz(anlikHiz+hiz);
        }
    }
    public void yavasla(int hiz){
        if(calisiyorMu){
            setAnlikHiz(anlikHiz-hiz);
        }
    }
}



