package exercicio5;

import java.util.Scanner;

public class InverteStringMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a texto ou o texto na qual será invertido:");
        String texto = scanner.nextLine();

        char[] letra = texto.toCharArray();
        int inicio = 0;
        int fim = letra.length-1;
        char letraTemporaria;

        System.out.println("A texto digitada foi: " + texto);

        while(fim>inicio){
            letraTemporaria = letra[inicio];
            letra[inicio] = letra[fim];
            letra[fim] = letraTemporaria;
            fim--;
            inicio++;
        }

        texto = new String(letra);
        System.out.println("A texto ou o texto invertido ficou: " + texto);
    }

}
