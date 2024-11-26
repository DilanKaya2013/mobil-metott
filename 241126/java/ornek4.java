import java.util.Scanner;

public class ornek4 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        double miktar1=150;
        double miktar2=250;
        double miktar3=350;

        System.out.println(miktar1 + " birim için fiyat: " + faturaHesapla(miktar1) + " TL");
        System.out.println(miktar2 + " birim için fiyat: " + faturaHesapla(miktar2) + " TL");
        System.out.println(miktar3 + " birim için fiyat: " + faturaHesapla(miktar3) + " TL");

    }
    public static double faturaHesapla( double miktar){

        double ucret=0;
        if(miktar<=200){
            ucret=miktar*2;
        } else if (miktar<=300) {
            ucret=200 * 2 + (miktar - 200)* 2.5;
        }
        else{
            ucret=200 * 2 + 100 * 2.5 + (miktar - 300) * 4;
        }
        return ucret;
    }

    }

