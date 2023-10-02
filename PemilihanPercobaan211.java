import java.util.Scanner;

public class PemilihanPercobaan211 {
    public static void main(String[] args) {
        
        Scanner input11 = new Scanner(System.in);

        System.out.print("Nilai uas    : ");
        float uas = input11.nextFloat();
        System.out.print("Nilai uts    : ");
        float uts = input11.nextFloat();
        System.out.print("Nilai kuis   : ");
        float kuis = input11.nextFloat();
        System.out.print("Nilai tugas  : ");
        float tugas = input11.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String message = total < 65 ? "Remidi" : "Tidak remidi";

        String huruf = "";

        if (80 < total) {
            huruf = "A";
        } else if (73 < total ) {
            huruf = "B+";
        } else if (65 < total ) {
            huruf = "B";
        } else if (60 < total ) {
            huruf = "C+";        
        } else if (50 < total ) {
            huruf = "C";
        } else if (39 < total ) {
            huruf = "D";
        } else if (total <= 39 ) {
            huruf = "E";
        }

        System.out.println("Nilai akhir = " + total +" " + huruf + " sehingga " + message);
    }
}