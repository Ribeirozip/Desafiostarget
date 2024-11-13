package Desafio4;
public class FaturamentoPorEstado {

    public static void main(String[] args) {
        // Faturamento por estado
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        // Faturamento total
        double totalFaturamento = sp + rj + mg + es + outros;

        // Calculando o percentual de cada estado
        double percentualSp = (sp / totalFaturamento) * 100;
        double percentualRj = (rj / totalFaturamento) * 100;
        double percentualMg = (mg / totalFaturamento) * 100;
        double percentualEs = (es / totalFaturamento) * 100;
        double percentualOutros = (outros / totalFaturamento) * 100;

        // Exibindo os resultados
        System.out.printf("Percentual de SP: %.2f%%\n", percentualSp);
        System.out.printf("Percentual de RJ: %.2f%%\n", percentualRj);
        System.out.printf("Percentual de MG: %.2f%%\n", percentualMg);
        System.out.printf("Percentual de ES: %.2f%%\n", percentualEs);
        System.out.printf("Percentual de Outros: %.2f%%\n", percentualOutros);
    }
}