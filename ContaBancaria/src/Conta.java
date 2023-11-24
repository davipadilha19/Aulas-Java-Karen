public class Conta {
    protected int numConta;
    public String nomeTitular;
    protected double valorTotal;
    protected double deposito;
    protected double saque;

    public Conta(int numConta, String nomeTitular, double valorTotal, double deposito, double saque) {
        this.numConta = numConta;
        this.nomeTitular = nomeTitular;
        this.valorTotal = valorTotal;
        this.deposito = deposito;
        this.saque = saque;
    }

    public Conta() {
    }

    protected double DepositoInicial(double valorTotal, double deposito){ return this.valorTotal += deposito;}
    protected double Sacar(double valorTotal, double saque){ return  this.valorTotal -= saque;}

    public String toString(){
        return "nome Titular: "+nomeTitular
                +" Número da Conta: "+ numConta
                +"Valor em Caixa: "+ valorTotal;
    }
}
