public enum Comida {
    SANDWICH("Presunto", 5.00),
    HOTDOG("Gourmet", 35.00),
    XBURGER("Hamburger de Siri", 20.00);

    private double preco;
    private String nome;

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    Comida(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
}
