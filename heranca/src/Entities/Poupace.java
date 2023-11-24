package Entities;

public class Poupace extends Account{

    private double taxaDeJuros;

    public Poupace(Integer numero, String titular, double saldo, double taxaDeJuros) {
        super(numero, titular, saldo);
        this.taxaDeJuros = taxaDeJuros;
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
    public void saldoAtualiado(){
        saldo= saldo * taxaDeJuros;
    }
    @Override
    public void saque(double valor){
        saldo -= valor;
    }
}
