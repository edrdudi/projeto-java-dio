import java.util.Scanner;

public class URI1177 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int T = teclado.nextInt();
        int contador = 0;

        int N[] = new int[1000];

        do {
            for (int i = 0; i < T; i++) {
                N[i] = i;
                System.out.println("N[" + contador + "] = " + N[i]);
                contador++;
                if (contador >= 1000) {
                    break;
                }
            }
        } while (contador < 1000);
    }
}
