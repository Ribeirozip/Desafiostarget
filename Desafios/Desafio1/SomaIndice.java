package Desafio1;

public class SomaIndice {
    public static void main(String[] args) {
        // Definindo as variáveis
        int INDICE = 13;
        int SOMA = 0;
        int K = 0;

        // Processamento
        System.out.println("Calculando a soma de todos os números de 1 até " + INDICE + "...\n");

        // Loop que realiza a soma
        while (K < INDICE) {
            K = K + 1;       // Incrementa K em 1
            SOMA = SOMA + K; // Soma o valor de K à variável SOMA
            System.out.println("Passo " + K + ": K = " + K + ", SOMA = " + SOMA);
        }

        // Resultado final
        System.out.println("\nResultado Final:");
        System.out.println("Após o loop, o valor final de SOMA é: " + SOMA);
    }
}
