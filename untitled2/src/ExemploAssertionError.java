public class ExemploAssertionError {

    public static void main(String[] args) {
        int numero = 5;

        assert numero == 10 : "O número deve ser igual a 10";

        System.out.println("Número: " + numero);
    }
}