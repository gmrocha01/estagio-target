package exercicio4;

import exercicio3.Faturamento;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class FaturamentoMensalMain {
    public static void main(String[] args) {
        FaturamentoMensal sp = new FaturamentoMensal("SP", 67836.43);
        FaturamentoMensal rj = new FaturamentoMensal("RJ", 36678.66);
        FaturamentoMensal mg = new FaturamentoMensal("MG", 29229.88);
        FaturamentoMensal es = new FaturamentoMensal("ES", 27165.48);
        FaturamentoMensal outros = new FaturamentoMensal("OUTROS", 19849.53);

        double valorTotal = es.getValor() + mg.getValor() + rj.getValor() + sp.getValor() + outros.getValor();

        double porcentagemSP = (sp.getValor() * 100) / valorTotal;
        double porcentagemRJ = (rj.getValor() * 100) / valorTotal;
        double porcentagemMG = (mg.getValor() * 100) / valorTotal;
        double porcentagemES = (es.getValor() * 100) / valorTotal;
        double porcentagemOutros = (outros.getValor() * 100) / valorTotal;

        //Para não exibir inúmeras casas depois da vírgula, utilizei o Decimal Format para arredondar o valor.
        DecimalFormat formatador = new DecimalFormat("0.00");
        System.out.println("======================= TOTAL DE PARTICIPAÇÃO DE CADA ESTADO (%) =======================\n");
        System.out.println("Estado de São Paulo:\n" + formatador.format(porcentagemSP) + "% do valor total");
        System.out.println("Estado de Rio de Janeiro:\n" + formatador.format(porcentagemRJ) + "% do valor total");
        System.out.println("Estado de Minas Gerais:\n" + formatador.format(porcentagemMG) + "% do valor total");
        System.out.println("Estado de Espírito Santo:\n" + formatador.format(porcentagemES) + "% do valor total");
        System.out.println("Outros estados:\n" + formatador.format(porcentagemOutros) + "% do valor total");

    }
}
