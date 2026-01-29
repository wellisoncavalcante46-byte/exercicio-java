package logicadeprogramacao;
import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        /*
        Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
        calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
        (1SM=R$788,00)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do seu salário: ");
        double salario = scanner.nextDouble();
        System.out.println("Informe o valor do salário mínimo atual");
        double salarioMinimo = scanner.nextDouble();

        double quantidadeSalarioMinimo = (salario / salarioMinimo);
        System.out.println("Você ganha: "+quantidadeSalarioMinimo+" salários mínimos");
        scanner.close();
    }
}
