import java.util.Scanner;

public class URI1178 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        double X = teclado.nextDouble();
        double[] N = new double[100];
        N[0] = X;

        System.out.printf("N[0] = %.4f\n", N[0]);
        for (int i=1; i < N.length; i++) {
            N[i] = N[i-1] / 2;
            System.out.printf("N["+i+"] = %.4f\n", N[i]);
        }
    }
}
