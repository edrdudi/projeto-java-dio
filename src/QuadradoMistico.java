import java.util.Scanner;

public class QuadradoMistico {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N = teclado.nextInt();
        int[][] matriz = new int[N][N];

        for (int l=0; l < N; l++) {
            for (int c=0; c < N; c++) {
                matriz[l][c] = teclado.nextInt();
            }
        }

        int somaRef = 0;
        for (int c=0; c < N; c++) {
            somaRef += matriz[0][c];
        }

        boolean qm = true;

        for (int l=1; l < N && qm; l++) {
            int somaL = 0;
            for (int c=0; c < N; c++) {
                somaL += matriz[l][c];
            }
            if (somaL != somaRef) {
                qm = false;
            }
        }

        for (int l=0; l < N; l++) {
            int somaC = 0;
            for (int c=0; c < N; c++) {
                somaC += matriz[l][c];
            }
            if (somaC != somaRef) {
                qm = false;
            }
        }
        if (qm) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
