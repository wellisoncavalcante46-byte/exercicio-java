package logicadeprogramacao;
import java.util.Scanner;
public class Ex000 {
    public static void main(String[] args){
        /*Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
        mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
        (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade em anos: ");
        int anos = scanner.nextInt();
        System.out.println("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();
        System.out.println("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();

        double total = ((anos * 365) + (meses * 30) + dias);
        System.out.println("Sua idade expressa em dias é: "+total+ " dias");

        scanner.close();
    }
}
