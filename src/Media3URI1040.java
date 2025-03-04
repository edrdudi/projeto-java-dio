import java.text.DecimalFormat;
import java.util.Scanner;

public class Media3URI1040 {
    public static void main (String args[]) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double N1 = teclado.nextDouble();
        double N2 = teclado.nextDouble();
        double N3 = teclado.nextDouble();
        double N4 = teclado.nextDouble();

        double media = ((N1*2) + (N2*3) + (N3*4) + (N4)) / 10;

        System.out.println("Media: " + df.format(media));

        if (media >= 7 ) {
            System.out.println("Aluno aprovado.");
        } else {
            if (media >= 5 && media < 7) {
                System.out.println("Aluno em exame.");

                double exame = teclado.nextDouble();
                System.out.println("Nota do exame: " + df.format(exame));

                double mediaFinal = (exame + media) /2;

                if (mediaFinal >= 5) {
                    System.out.println("Aluno aprovado.");
                    System.out.println("Media final: " + df.format(mediaFinal));
                }
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
    }
}
