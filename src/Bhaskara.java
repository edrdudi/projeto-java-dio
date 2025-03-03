import java.util.Scanner;

public class Bhaskara {
    public static void main (String args []) {
        Scanner teclado = new Scanner(System.in);

        double R1, R2, delta;

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();

        delta = B * B - 4 * A * C;

        if (delta < 0 || A == 0) {
            System.out.println("Impossivel calcular");
        } else {
            R1 = (-B + Math.sqrt(delta)) / (2 * A);
            R2 = (-B - Math.sqrt(delta)) / (2 * A);

            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
    }
}
