public class Conta {
    private float saldo;
    private String nome;
    public Conta(float saldo, String nome){
        this.saldo = saldo;
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo += (saldo*0.10);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
