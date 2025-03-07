import java.util.Scanner;
import java.text.DecimalFormat;

public class PositivosMediaURI1064 {
    public static void main (String[] args) {
        DecimalFormat format = new DecimalFormat("0.0");
        Scanner teclado = new Scanner(System.in);
        int j = 0;
        double num = 0;
        double resultado = 0;

        for (int i = 1; i <= 6; i++) {
            num = teclado.nextDouble();
            if (num > 0) {
                j++;
                resultado = resultado + num;
            }
        }
        System.out.println(j + " valores positivos");
        double media = resultado / j;
        System.out.println(format.format(media));
    }
}