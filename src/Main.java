import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final float DIAS = 365;
        final byte PORCENTAJE = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.println("Interes Anual: ");
        float annualInterest = scanner.nextFloat();
        float dailyInterest = annualInterest / PORCENTAJE / DIAS;

        System.out.println("Periodo (Dias): ");
        byte dias = scanner.nextByte();
        float numberOfPayments = dias * DIAS;

        double mortgage = principal
                * (dailyInterest * Math.pow(1 + dailyInterest, numberOfPayments))
                / (Math.pow(1 + dailyInterest, numberOfPayments))
                * dias;


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Intereses: " + mortgageFormatted);
    }


}