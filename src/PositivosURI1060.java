import java.util.Scanner;

public class PositivosURI1060 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int j = 0;

        for (int i = 1; i <= 6; i++) {
            double num = teclado.nextDouble();
            if (num > 0) {
                j++;
            }
        }
        System.out.println(j + " valores positivos");
    }
}
