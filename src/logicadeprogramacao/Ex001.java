package logicadeprogramacao;

public class Ex001 {
    public static void main(String[] args) {
     /*  Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
            números 4, 5 e 6. A soma das duas médias. A média das médias. */

        float media01 = (8 + 9 + 7) / 3f;
        float media02 = (4 + 5 + 6) / 3f;
        float somaMedia = media01 + media02;
        float mediaDasMedias = (media01 + media02) / 2f;

        System.out.println(media01);
        System.out.println(media02);
        System.out.println(somaMedia);
        System.out.println(mediaDasMedias);

    }
}
