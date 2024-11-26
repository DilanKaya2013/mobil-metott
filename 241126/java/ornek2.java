import java.util.Scanner;

public class ornek2 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int sayi1;
        System.out.println("1.sayi");
        sayi1= oku.nextInt();

        int kare=kareAl((sayi1));
        System.out.println("kareAl:"+kare);

        //int sonuc=kareAl(3);
       // System.out.println("Sonuç:"+sonuc);
    }
    public static int kareAl(int sayi) {
        int sonuc=sayi*sayi;
        return sonuc;
        //return sayi * sayi;
    }
}




