package logicadeprogramacao;
import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {
/*
        Escrever um algoritmo que lê:
- a porcentagem do IPI a ser acrescido no valor das peças
- o código da peça 1, valor unitário da peça 1, quantidade de peças 1
- o código da peça 2, valor unitário da peça 2, quantidade de peças 2
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado.
Fórmula : (valor1*quant1 + valor2*quant2)*(IPI/100 + 1)
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a porcentagem do IPI: ");
        double ipi = scanner.nextDouble();

        System.out.println("Informe o código da peça 1?");
        int codigo1 = scanner.nextInt();
        System.out.println("Informe o valor unitário da peça 1?");
        double valor1 = scanner.nextDouble();
        System.out.println("Informe a quantidade de peça 1?");
        int quant1 = scanner.nextInt();

        System.out.println("Informe o código da peça 2?");
        int codigo2 = scanner.nextInt();
        System.out.println("Informe o valor unitário da peça 2?");
        double valor2 = scanner.nextDouble();
        System.out.println("Informe a quantidade de peça 2?");
        int quant2 = scanner.nextInt();

        double valorTotal = (valor1*quant1 + valor2*quant2)*(ipi/100+1d);
        System.out.printf("O valor total é de: %.2f", valorTotal);
        scanner.close();


    }

}
