import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Depositar valor:");
        float saldo = sc.nextFloat();

        Conta conta = new Conta(saldo, nome);
        conta.setSaldo(saldo);

        System.out.println("Seu novo saldo: " + conta.getSaldo());
    }
}