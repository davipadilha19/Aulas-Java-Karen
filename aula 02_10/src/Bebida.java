public enum Bebida {
    SODA ("Coke", 5.00),
    JUICE("Laranja", 3.00),
    WATER("Sem gás", 2.50);
    private double preco;
    private String nome;
    Bebida(String nome, double preco){
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }
}
