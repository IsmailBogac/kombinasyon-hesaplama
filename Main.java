import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("N'nin Faktöriyel sayısı :");
        int n = input.nextInt();
        int total=1;
        for (int i =1 ; i<=n ; i++){
            total = total*i;
        }

        System.out.print("R'nin Faktöriyel sayısı :");
        int r = input.nextInt();
        int rTotal =1;
        for (int j =1 ; j <= r ; j++){
            rTotal = rTotal*j;
        }
        int fToplam=1;
        for (int fark=1 ; fark <= (n-r);fark++){
            fToplam = fToplam *fark;
        }

       int combination = total /(rTotal * fToplam);

        System.out.println(combination);



    /*
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("n degerini gir: ");
            int n = scan.nextInt();
            System.out.println("r degerini gir: ");
            int r = scan.nextInt();

            while (true) {
                if (n < r) {
                    System.out.println("n degeri r'den buyuk olmasi lazim tekrar deneyin");
                    break;
                }
                int sayac = 1;
                int sayac2 = 1;
                int sayac3 = 1;
                for (int i = 1; i <= n; i++) {
                    sayac = sayac * i;
                }

                for (int j = 1; j <= r; j++) {
                    sayac2 = sayac2 * j;
                }

                for (int k = 1; k <= (n - r); k++) {
                    sayac3 = sayac3 * k;
                }

                int kombinasyon = sayac / (sayac2 * sayac3);
                System.out.println("Sonuc: " + kombinasyon);
                break;


    */
            }


}