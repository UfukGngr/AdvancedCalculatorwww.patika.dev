import java.util.Scanner;

public class Main {

    static int sum(int a, int b){
        int result=a+b;
        System.out.println("Toplam :" +result);
        return result;
    }
    static int minus(int a, int b){
        int result=a-b;
        System.out.println("Çıkarma :"+ result);
        return result;
    }
    static int times(int a, int b){
        int result= a * b;
        System.out.println("Çarpma :"+result );
        return result;
    }
    static int divided(int a, int b){
        if ( b== 0 ){
            System.out.println("İkinci sayı 0'dan farklı olmalıdır.");
            return 0;
        }

        int result=a / b;
        System.out.println("Bölme :" + result);
        return result;
    }

    static int power(int a , int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        System.out.println("Üs Alma :"+ result);
        return result;
    }

    static int mod(int a , int b){
        if (b == 0){
            System.out.println("İkinci sayı sıfırdan farklı olmalıdır.");
            return 0;
        }

        int result=a % b;
        System.out.println("Mod:" + result);
        return result;
    }

   static void calc(int a, int b){
       System.out.println("Çevresi:" + (2*(a+b)));
       System.out.println("Alanı:" + (a*b));
   }
    public static void main(String[] args) {
        int select,a,b;
        Scanner scan=new Scanner(System.in);


        String menu= """
                1-Toplama İşlemi
                2-Çıkarma  İşlemi
                3-Çarpma İşlemi
                4-Bölme İşlemi
                5-Üslü Sayı Hesaplama
                6-Mod Alma
                7-Dikdörtgen Alan ve Çevresini Hesaplama
                0-Çıkış Yap""";

        System.out.println(menu);

        while (true){
            System.out.print("Yapmak istediğiniz işlemi seçiniz:");
            select=scan.nextInt();

            if (select == 0){
                break;
            }

            System.out.print("İlk sayıyı giriniz:");
            a=scan.nextInt();

            System.out.print("İkinci sayıyı giriniz:");
            b=scan.nextInt();

            switch (select) {
                case 1 -> sum(a, b);
                case 2 -> minus(a, b);
                case 3 -> times(a, b);
                case 4 -> divided(a, b);
                case 5 -> power(a, b);
                case 6 -> mod(a, b);
                case 7 -> calc(a, b);
                default -> System.out.println("Geçersiz bir işlem girdiniz.");
            }
        }

    }
}