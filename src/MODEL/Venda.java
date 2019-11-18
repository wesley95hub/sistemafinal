
package MODEL;


public class Venda {
    int idVenda;
    String dataVenda;
    double valorTotalVenda;
    double descontoVenda;
    String tipoPagamentoVenda;

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public double getValorTotalVenda() {
        return valorTotalVenda;
    }

    public void setValorTotalVenda(double valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    public double getDescontoVenda() {
        return descontoVenda;
    }

    public void setDescontoVenda(double descontoVenda) {
        this.descontoVenda = descontoVenda;
    }

    public String getTipoPagamentoVenda() {
        return tipoPagamentoVenda;
    }

    public void setTipoPagamentoVenda(String tipoPagamentoVenda) {
        this.tipoPagamentoVenda = tipoPagamentoVenda;
    }
    
}
