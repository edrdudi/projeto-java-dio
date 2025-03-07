import java.util.Scanner;

public class MeteoroOlimpiada {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 0;
        int x1, x2, y1, y2;
        int teste =0;

        do {
            x1 = teclado.nextInt();
            y1 = teclado.nextInt();
            x2 = teclado.nextInt();
            y2 = teclado.nextInt();

            if (x1 != 0 || x2 != 0 || y1 != 0 || y2 != 0) {
                int meteoros = teclado.nextInt();
                teste++;

                for (int i = 1; i <= meteoros; i++) {
                    int pos1 = teclado.nextInt();
                    int pos2 = teclado.nextInt();
                    if (pos1 >= x1 && pos1 <= x2 && pos2 <= y1 && pos2 >= y2) {
                        contador++;
                    }
                }
                System.out.println("Teste " + teste);
                System.out.println(contador);
                System.out.println("");
            }
        } while (x1 != 0 || x2 != 0 || y1 != 0 || y2 != 0);
    }
}
