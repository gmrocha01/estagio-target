package exercicio2;

import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] fib = new int[30];
        fib[0] = 0;
        fib[1] = 1;

        System.out.println("Digite o número ao qual será verificado se está ou não na sequência de Fibonacci:");
        int val = scanner.nextInt();

        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 2] + fib[i - 1];
        }

        boolean possui = false;
        for (int i = 0; i < fib.length; i++) {
            if (fib[i] == val) {
                possui = true;
            }
        }
        if (possui == true) {
            System.out.println("O valor " + val + " faz parte da sequência de Fibonacci !!!!");
        } else {
            System.out.println("O valor " + val + " NÃO faz parte da sequência de Fibonacci !!!!");
        }
    }
}
