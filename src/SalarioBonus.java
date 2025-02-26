import java.util.Scanner;
public class SalarioBonus {
    public static void main (String []args) {

        String nome;
        double salario, comissao, vendas, total;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        nome = teclado.nextLine();

        System.out.println("Digite o seu salario fixo: ");
        salario = teclado.nextDouble();

        System.out.println("Digite o quanto vendeu: ");
        vendas = teclado.nextDouble();

        comissao = vendas * (0.15);

        total = comissao + salario;

        System.out.printf("TOTAL = R$ %.2f\n", total);

    }
}