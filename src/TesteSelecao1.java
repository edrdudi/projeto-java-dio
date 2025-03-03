import java.util.Scanner;

public class TesteSelecao1 {
    public static void main (String args[]) {
        Scanner telcado = new Scanner(System.in);

        int A = telcado.nextInt();
        int B = telcado.nextInt();
        int C = telcado.nextInt();
        int D = telcado.nextInt();

        int soma1 = C + D;
        int soma2 = A + B;

        if (B > C && D > A && soma1 > soma2 && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valor aceitos");
        } else {
            System.out.println("Valores não aceitos");
        }
    }
}
