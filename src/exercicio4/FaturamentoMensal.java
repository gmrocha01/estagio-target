package exercicio4;

public class FaturamentoMensal {
    private String estado;
    private double valor;

    public FaturamentoMensal(String estado, double valor) {
        this.estado = estado;
        this.valor = valor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "FaturamentoMensal{" +
                "estado='" + estado + '\'' +
                ", valor=" + valor +
                '}';
    }
}
