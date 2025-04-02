import java.util.Scanner;

public class URI1181 {
    public static void mais (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int L = teclado.nextInt();
        teclado.nextLine();
        char T = teclado.nextLine().charAt(0);
        double[][] M = new double[12][12];

        for (int l=0; l < 12; l++){
            for (int c=0; c < 12; c++){
                M[l][c] = teclado.nextDouble();
            }
        }

        double res=0;
        for (int i=0; i < 12; i++){
            res += M[L][i];
        }

        if (T == 'S') {
            System.out.printf("%.1f\n", res);
        } else {
            System.out.printf("%.1f\n", res/12);
        }
    }
}
