import java.util.Scanner;

public class URI1175 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int controle = 0;

        int N[] = new int[20];

        for (int i=0; i < N.length; i++) {
            N[i] = teclado.nextInt();
        }

        for (int i=0; i < N.length / 2; i++) {
            controle = N[i];
            N[i] = N[N.length - i -1];
            N[N.length - i - 1] = controle;
        }

        for (int i=0; i < N.length; i++) {
            System.out.println("N["+i+"] = " + N[i]);
        }
    }
}
