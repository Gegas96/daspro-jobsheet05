import java.util.Scanner;

public class PemilihanPercobaan111 {
    public static void main(String[] args) {
        
        Scanner input11 = new Scanner(System.in);

        
        System.out.print("Masukkan angka: ");
        int angka = input11.nextInt();

        String op = angka % 2 == 0 ? "genap" : "ganjil";
        System.out.println("Angka "+angka+" adalah bilangan " +op);
    }
}