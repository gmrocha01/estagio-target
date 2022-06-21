package exercicio3;

import java.util.*;

public class FaturamentoMain {
    public static void main(String[] args) {
        List<Faturamento> faturamentoList = new ArrayList<>();

        //Adicionando os dados informados no anexo.
        faturamentoList.add(new Faturamento(1, 22174.1664d));
        faturamentoList.add(new Faturamento(2, 24537.6698d));
        faturamentoList.add(new Faturamento(3, 26139.6134d));
        faturamentoList.add(new Faturamento(4, 0d));
        faturamentoList.add(new Faturamento(5, 0d));
        faturamentoList.add(new Faturamento(6, 26742.6612d));
        faturamentoList.add(new Faturamento(7, 0d));
        faturamentoList.add(new Faturamento(8, 42889.2258d));
        faturamentoList.add(new Faturamento(9, 46251.174d));
        faturamentoList.add(new Faturamento(10, 11191.4722d));
        faturamentoList.add(new Faturamento(11, 0d));
        faturamentoList.add(new Faturamento(12, 0d));
        faturamentoList.add(new Faturamento(13, 3847.4823d));
        faturamentoList.add(new Faturamento(14, 373.7838d));
        faturamentoList.add(new Faturamento(15, 2659.7563d));
        faturamentoList.add(new Faturamento(16, 48924.2448d));
        faturamentoList.add(new Faturamento(17, 18419.2614d));
        faturamentoList.add(new Faturamento(18, 0d));
        faturamentoList.add(new Faturamento(19, 0d));
        faturamentoList.add(new Faturamento(20, 35240.1826d));
        faturamentoList.add(new Faturamento(21, 43829.1667d));
        faturamentoList.add(new Faturamento(22, 18235.6852d));
        faturamentoList.add(new Faturamento(23, 4355.0662d));
        faturamentoList.add(new Faturamento(24, 13327.1025d));
        faturamentoList.add(new Faturamento(25, 0d));
        faturamentoList.add(new Faturamento(26, 0d));
        faturamentoList.add(new Faturamento(27, 25681.8318d));
        faturamentoList.add(new Faturamento(28, 1718.1221d));
        faturamentoList.add(new Faturamento(29, 13220.495d));
        faturamentoList.add(new Faturamento(30, 8414.61d));


        double minimo = faturamentoList.get(0).getValor();
        double maximo = faturamentoList.get(0).getValor();


        for (int i = 0; i < faturamentoList.size(); i++) {
            if (faturamentoList.get(i).getValor() < minimo) {
                minimo = faturamentoList.get(i).getValor();
            }
        }
        for (int i = 0; i < faturamentoList.size(); i++) {
            if (faturamentoList.get(i).getValor() > maximo) {
                maximo = faturamentoList.get(i).getValor();
            }
        }

        double soma = 0;
        for (int i = 0; i < faturamentoList.size(); i++) {
            soma = soma + faturamentoList.get(i).getValor();
        }

        double mediaMensal = soma / faturamentoList.size();
        int acimaDaMedia = 0;
        for (int i = 0; i < faturamentoList.size(); i++) {
            if (faturamentoList.get(i).getValor() > mediaMensal) {
                acimaDaMedia++;
            }
        }
        //IMPRESSÕES NA TELA
        System.out.println("O menor valor de faturamento ocorrido em um dia do mês foi: " + minimo);
        System.out.println("O maior valor de faturamento ocorrido em um dia do mês foi: " + maximo);
        System.out.println("O total de dias ao qual o faturamento foi acima da média foi: " + acimaDaMedia);


    }
}
