import java.util.Scanner;

public class FalhaURI2167 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N, contador, pos;
        pos = 0;

        N = teclado.nextInt();

        int R1[] = new int[N];

        for (int i=0; i < R1.length; i++) {
            R1[i] = teclado.nextInt();
        }

        for (int i=1; i < R1.length; i++) {
            if (R1[i] < R1[i-1]) {
                pos = i+1;
                break;
            }
        }
        System.out.println(pos);
    }
}
