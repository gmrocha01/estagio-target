package exercicio3;

import java.util.List;

public class Faturamento {
    public int dia;
    public double valor;

    public Faturamento(int dia, double valor) {
        this.dia = dia;
        this.valor = valor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "{dia=" + dia +
                ", valor=" + valor +
                '}';
    }
}
