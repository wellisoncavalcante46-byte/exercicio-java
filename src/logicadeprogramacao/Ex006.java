package logicadeprogramacao;
import java.util.Scanner;
public class Ex006 {
    public static void main(String[] args) {
        /*Soma e Comparação
        Lê três valores (A, B, C) e calcula a soma de A e B. Em seguida, informa se a soma é menor que C.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor de A: ");
        double a = scanner.nextDouble();
        System.out.println("Informe o valor de B: ");
        double b = scanner.nextDouble();
        System.out.println("Informe o valor de C: ");
        double c = scanner.nextDouble();

        double soma = a + b;
        System.out.println("Soma de A + B: "+soma);

        if (soma < c) {
            System.out.println(soma+" é menor que "+c);
        } else if (soma > c) {
            System.out.println(soma+" é maior que "+c);
        }
        else {
            System.out.println(soma + " é igual a " + c);
        }
        scanner.close();
    }
}
