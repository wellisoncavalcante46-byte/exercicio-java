package logicadeprogramacao;
import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        //Informar um saldo e imprimir o saldo com reajuste de 1%.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        double reajuste1 = saldo * 1.01;
        double reajuste2 = saldo * 0.99;

        System.out.println("Saldo com aumento de 1%: "+reajuste1);
        System.out.println("Saldo com redução de 1%: "+reajuste2);

        scanner.close();
    }
}
