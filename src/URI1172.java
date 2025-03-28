import java.util.Scanner;

public class URI1172 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int X[] = new int[10];

        for (int i=0; i < X.length; i++) {
            X[i] = teclado.nextInt();
            if (X[i] <= 0) {
                X[i] = 1;
            }
            System.out.println("X["+i+"]" + " = " + X[i]);
        }
    }
}
