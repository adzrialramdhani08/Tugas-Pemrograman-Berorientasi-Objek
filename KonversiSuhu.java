import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Konversi Suhu ===");
        System.out.print("Masukkan suhu dalam Reamur: ");

        double reamur = scanner.nextDouble();

        double celcius = convertReamurToCelcius(reamur);
        double fahrenheit = convertReamurToFahrenheit(reamur);
        double kelvin = convertReamurToKelvin(reamur);

        System.out.println("Suhu dalam Celcius: " + celcius);
        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);
        System.out.println("Suhu dalam Kelvin: " + kelvin);

        scanner.close();
    }

    private static double convertReamurToCelcius(double reamur) {
        return (5.0/4.0) * reamur;
    }

    private static double convertReamurToFahrenheit(double reamur) {
        double celcius = convertReamurToCelcius(reamur);
        return (9.0/5.0) * celcius + 32.0;
    }

    private static double convertReamurToKelvin(double reamur) {
        double celcius = convertReamurToCelcius(reamur);
        return celcius + 273.15;
    }
}