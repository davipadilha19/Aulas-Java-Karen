import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta conta =  new Conta();

        Random gerador = new Random();
        int numConta = gerador.nextInt(1999);

        double depositoInicial = 0.0;
        double deposito = 0.0;
        int escolha = 0;
        int op = 0;
        int senha ;
        int escolha2 = 0;
        int tempo = 0;
        String nomeTitular;
        System.out.println("Entre com Seu dados:");
        System.out.println("Digite seu nome: ");
        nomeTitular = sc.nextLine();
        conta.setNomeTitular(nomeTitular);
        conta.setNumConta(numConta);
        System.out.println("Numero de Registro gerado para "+conta.getNomeTitular(nomeTitular)+"\nNumero de Registro: "+ conta.getNumConta(numConta));
        System.out.println("Todo valor Depositado inicialmente tera o acrescimo de 10%.\nDeseja fazer um deposito Inicial \n1: SIM\n2:NÃO\nObs: Caso seja digigtado outra opção será considerado com NÃO.");
        escolha = sc.nextInt();
            if(escolha == 1 ){
                System.out.println("Qual o valor que você deseja depositar: ");
                depositoInicial = sc.nextDouble();
                conta.setDepositoInicial(depositoInicial);
                System.out.println("Seu valor em caixa é "+conta.getValorTotal());
            }else if(escolha == 2){
                System.out.println("Você não depositou. \nSeu valor em caixa é "+conta.getValorTotal());
            }else {
                System.out.println("Você não depositou. \nSeu valor em caixa é "+conta.getValorTotal());
            }
        System.out.println("Defina uma senha para entrar no sistema, Saque e Deposito: ");
            senha = sc.nextInt();
        System.out.println("Load...\nLoad...\nLoad...\nLoad...\nLoad...\nLoad...\nLoad...\nLoad...\nLoad...\nLoad...\nLoad...\nLoad...\n");
        System.out.println("Tudo pronto.");
        System.out.println("Digite senha para entrar no sistema:");
        int validaSenha = sc.nextInt();
        while (senha != validaSenha){
            System.out.println("Senha incorreta.\nTente novamente.");
            validaSenha = sc.nextInt();
        }
        System.out.println("O que deseja fazer: " );
       // op = sc.nextInt();
        while (op != 6) {
            System.out.println("\n1: Sacar" +
                    "\n2: Depositar" +
                    "\n3: Alterar o nome" +
                    "\n4: Extrato" +
                    "\n5: sair");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("Qual o valor que deseja sacar:");
                double saque = sc.nextDouble();
                System.out.println("Digite a senha:");
                validaSenha = sc.nextInt();
                while (validaSenha != senha) {
                    System.out.println("SENHA INCORRETA\nTente novamente");
                    validaSenha = sc.nextInt();
                }
                if (conta.getValorTotal() >= saque) {
                    conta.setSaque(saque);
                    System.out.println("Seu Valor em caixa é de R$" + conta.getValorTotal());
                    System.out.println(conta);
                } else {
                    System.out.println("Você não tem valor suficiente em caixa para realizar essa ação.");
                    System.out.println(conta);
                }
            } else if (op == 2) {
                System.out.println("Qual o valor que deseja depositar?");
                deposito = sc.nextInt();
                System.out.println("Digite sua senha:");
                validaSenha = sc.nextInt();
                while (validaSenha != senha) {
                    System.out.println("SENHA INCORRETA\nTente novamente");
                    validaSenha = sc.nextInt();
                }
                conta.setDeposito(deposito);
                System.out.println("Seu Valor em Caixa é de R$" + conta.getValorTotal());
                System.out.println(conta);
            }else if (op == 3){
                System.out.println("Qual nome voce deseja: ");
                sc.nextLine();
                nomeTitular = sc.nextLine();
                conta.setNomeTitular(nomeTitular);
                System.out.println("Nome alterado com sucesso;" +
                        "\n"+conta.getNomeTitular(nomeTitular));
                System.out.println(conta);
            }else if(op == 4){
                System.out.println("Valor em caixa: "+conta.getValorTotal());
                System.out.println(conta);
            }else if (op == 5){
                    System.out.println("Pressione '6'");
                    System.out.println(conta);
                    op = sc.nextInt();
                }
        }
    }
}