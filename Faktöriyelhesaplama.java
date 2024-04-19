import java.util.Scanner;

public class Faktöriyelhesaplama {

    static int fakt(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fakt(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Faktöriyel hesabi yapilacak sayiyi girin");

        int sayi = giris.nextInt();

        // Faktöriyel hesaplama işlemini buraya ekleyebilirsiniz.
        System.out.println(fakt(sayi));
        giris.close();

    }
}
