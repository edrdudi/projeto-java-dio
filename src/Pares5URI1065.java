import java.util.Scanner;

public class Pares5URI1065 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, cont;
        cont = 0;

        for (int i=0; i<5; i++) {
            num = teclado.nextInt();
            if (num % 2 == 0) {
                cont++;
            }
        }
        System.out.println(cont + " valores pares");
    }
}
