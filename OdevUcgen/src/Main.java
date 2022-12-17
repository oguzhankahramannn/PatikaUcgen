import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taban,yukseklik; double c;
        Scanner scan = new Scanner(System.in);
        System.out.println("Üçgenin tabanını giriniz : ");
        taban = scan.nextInt();
        System.out.println("Üçgenin yüksekliği kenarını giriniz : ");
        yukseklik = scan.nextInt();
        c = taban*yukseklik/2;
        System.out.println("Üçgenin alanı:"+ " " + c);


    }
}