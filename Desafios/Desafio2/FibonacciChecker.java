package Desafio2;

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        // Entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        // Fechar scanner
        scanner.close();

        // Variáveis iniciais para calcular Fibonacci
        int fib1 = 0;
        int fib2 = 1;
        int fibonacci = 0;

        // Mensagem de resultado
        boolean pertence = false;

        // Verificação se o número pertence à sequência de Fibonacci
        if (numero == 0 || numero == 1) {
            pertence = true; // Os primeiros números (0 e 1) sempre pertencem
        } else {
            // Gera a sequência de Fibonacci até atingir ou ultrapassar o número
            while (fibonacci < numero) {
                fibonacci = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibonacci;

                // Verifica se o número informado coincide com um número da sequência
                if (fibonacci == numero) {
                    pertence = true;
                    break;
                }
            }
        }

        // Exibe o resultado
        if (pertence) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}
