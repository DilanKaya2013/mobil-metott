import java.util.Scanner;

public class uygulama1 {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        int yazili1,yazili2,ortalama;
        System.out.print("1.sayı:");
        yazili1= oku.nextInt();
        System.out.print("2.sayı:");
        yazili2= oku.nextInt();
        ortalama=ortalama(yazili1,yazili2);
        System.out.println("ortalama:"+ortalama);

    }
    private static int ortalama(int yazili1,int yazili2){
        int sonuc=(yazili1+yazili2)/2;
        return sonuc;
    }
}
