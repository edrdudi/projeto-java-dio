import java.util.Scanner;

public class BafoOlimpiada {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        int R, A, B, contador;
        int teste = 0;
        int somaA = 0;
        int somaB = 0;

        do {
            R = teclado.nextInt();

            for (contador = 0; contador < R; contador++) {

                A = teclado.nextInt();
                B = teclado.nextInt();

                somaA += A;
                somaB += B;

            }
            if (R != 0) {
                teste++;
                System.out.println("Teste " + teste);

                if (somaA < somaB) {
                    System.out.println("Beto");
                } else {
                    System.out.println("Aldo");
                }

                System.out.println("\n");
            }

        } while (R != 0);
    }
}
