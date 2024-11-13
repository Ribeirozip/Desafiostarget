package Desafio5;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        // Criação do scanner para leitura do input
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário para digitar uma string
        System.out.print("Digite uma string para inverter: ");
        String input = scanner.nextLine();

        // Fechar o scanner
        scanner.close();

        // Chamada da função que inverte a string
        String resultado = inverterString(input);

        // Exibição da string invertida
        System.out.println("String invertida: " + resultado);
    }

    // Função que inverte a string
    public static String inverterString(String str) {
        String invertida = ""; // Variável para armazenar a string invertida

        // Percorre a string de trás para frente
        for (int i = str.length() - 1; i >= 0; i--) {
            invertida += str.charAt(i); // Adiciona o caractere invertido
        }

        return invertida;
    }
    
}
