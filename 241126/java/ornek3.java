import java.util.Scanner;

public class ornek3 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int sayi1, sayi2;
        System.out.println("sayi1");
        sayi1 = oku.nextInt();
        System.out.println("sayi2");
        sayi1 = oku.nextInt();

    }
    public static int farkHesapla(int sayi1,int sayi2){
        if (sayi1>sayi2){
            return sayi1-sayi2;
        }
               else {
                   return sayi2-sayi1;
        }
    }
}

