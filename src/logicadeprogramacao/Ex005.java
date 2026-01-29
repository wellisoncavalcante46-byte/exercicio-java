package logicadeprogramacao;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
            /*Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
    antecessor e seu sucessor.*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int number =  scanner.nextInt();
        int sucessor = number + 1;
        int antecessor = number - 1;

        System.out.println("O seu sucessor é: "+sucessor);
        System.out.println("O seu antecessor é: "+antecessor);
        scanner.close();
    }
}
