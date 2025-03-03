import java.util.Scanner;

public class LancheURI1038 {
    public static void main (String []args) {
        Scanner teclado = new Scanner(System.in);

        double preco;
        preco = 0;

        int codigo = teclado.nextInt();
        double qtdItem = teclado.nextDouble();

        switch (codigo) {
            case 1:
                preco = qtdItem * 4;
                break;

            case 2:
                preco = qtdItem * 4.5;
                break;

            case 3:
                preco = qtdItem * 5;
                break;

            case 4:
                preco = qtdItem * 2;
                break;

            case 5:
                preco = qtdItem * 1.5;
                break;
        }

        System.out.printf("Total: R$ %.2f\n", preco);
    }
}
