import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class HitungUmur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Hitung Umur ===");
        System.out.print("Masukkan tahun lahir Anda: ");

        int tahunLahir = scanner.nextInt();

        int umur = calculateAge(tahunLahir);
        System.out.println("Umur Anda tahun ini adalah " + umur + " tahun.");

        scanner.close();
    }

    private static int calculateAge(int tahunLahir) {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        if (isLeapYear(currentYear)) {
            currentYear--;
        }
        return currentYear - tahunLahir;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}