import java.util.Scanner;

public class TriangulosURI1045 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        double aux;
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();

        if (B > A && B > C) {
            aux = A;
            A = B;
            B = aux;
        } else if (C > A) {
            aux = A;
            A = C;
            C = aux;
        }

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if ((A * A) == (B * B) + (C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (A * A > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if ((A * A) < (B * B) + (C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }
            if (A == B && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if (A == B && A != C || B == C && B != A || C == A && C != B) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
