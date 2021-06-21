import java.util.Scanner;

public class UcgenAlanHesapla {

    public static void main(String[] args) {

        float a,b,c,u;

        Scanner scan = new Scanner(System.in);

        System.out.print("1.Dik kenar uzunluğunu giriniz: ");
        a=scan.nextFloat();

        System.out.print("2.Dik kenar uzunluğunu giriniz: ");
        b=scan.nextFloat();

        c= (float) Math.sqrt((Math.pow(a,2))+(Math.pow(b,2)));
        System.out.println("Hipotenüs uzunluğu : " +c);

        u = (a*b)/2;
        System.out.println("Üçgenin alanı : "+u);

        System.out.println("Üçgenin Çevresi :"+ (a+b+c));




    }

}
