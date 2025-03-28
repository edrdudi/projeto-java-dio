import java.util.Scanner;

public class URI1173 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);

        int N[] = new int[10];

        N[0] = teclado.nextInt();
        int X = N[0];

        System.out.println("N[0] = " + N[0]);

        for(int i=1; i < N.length; i++) {
            X = X * 2;
            System.out.println("N["+i+"]"+" = " + X);
        }
    }
}
