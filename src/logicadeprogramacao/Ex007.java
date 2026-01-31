package logicadeprogramacao;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        // Recebe um número inteiro e verifica se ele é par ou ímpar e se é positivo ou negativo.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro qualquer.");
        int number = scanner.nextInt();

        String parOuImpar = (number % 2 == 0) ? "par" : "ímpar";

        if (number == 0) {
            System.out.println("0 é par e não é positivo nem negativo");
        } else {
            String sinal = (number > 0) ? "positivo" : "negativo";
            System.out.println(number + " é " + parOuImpar + " e " + sinal + ".");
        }
        scanner.close();

    }
}
