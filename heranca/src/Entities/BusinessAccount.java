package Entities;

public class BusinessAccount extends Account {

        private double limiteDeEmprestimo;

        public BusinessAccount(){
            super();
        }

    public BusinessAccount(Integer numero, String titular, double saldo, double limiteDeEmprestimo) {
        super(numero, titular, saldo);
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public double getLimiteDeEmprestimo() {
        return limiteDeEmprestimo;
    }

    public void setLimiteDeEmprestimo(double limiteDeEmprestimo) {
        this.limiteDeEmprestimo = limiteDeEmprestimo;
    }

    public void loan(double valor){
            if (valor <= limiteDeEmprestimo) {
                deposito(valor);
            }
    }
    @Override
    public void saque(double valor){
            super.saque(valor);
            saldo -= 2.0;
    }

}
