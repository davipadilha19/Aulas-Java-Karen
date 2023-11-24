import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta = new Conta();
        int escolha = 0;
        System.out.println("Entre Com os dados do Cliente:");
        System.out.println("Nome: ");
        conta.nomeTitular = sc.nextLine();
        System.out.println("Deseja fazer algum deposito? (1: sim\n2:não)");
        escolha = sc.nextInt();
            if(escolha == 1){
                System.out.println("Qual o valor:");
                conta.deposito = sc.nextInt();
        }else if (escolha == 2){
                conta.deposito = 0;
            }else {
                System.out.println("Erro. Opição invalida. Valor atribuido a 0");
                conta.deposito = 0;
            }
        
    }
}