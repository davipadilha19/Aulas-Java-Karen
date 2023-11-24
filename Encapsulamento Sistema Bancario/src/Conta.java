public class Conta {
    private int numConta;
    private String nomeTitular;
    private double deposito;
    private double depositoInicial;
    private double saque;
    private double valorTotal;

    Conta(){
    }
    public void setDepositoInicial(double depositoInicial){
        this.valorTotal =valorTotal+depositoInicial+ (depositoInicial*0.10);
    }
    public void setDeposito(double deposito){
        this.valorTotal += deposito;
    }
    public double getValorTotal(){
        return valorTotal;
    }
    public void setSaque(double saque){
        this.valorTotal -= (saque+5);
    }

    public int getNumConta(int numConta){

        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String toString(){

        return "Número da conta: "+numConta+" Nome Titular: "+nomeTitular+" saldo: "+ getValorTotal();
    }


    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getNomeTitular(String nomeTitular) {
        return nomeTitular;
    }
}
