public class Araba {
    String marka;
    String model;
     int anlikHiz;
     int sonHiz;

    public Araba(String marka, String model, int sonHiz) {
        this.marka = marka;
        this.model = model;
        this.sonHiz = sonHiz;
    }

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


}
