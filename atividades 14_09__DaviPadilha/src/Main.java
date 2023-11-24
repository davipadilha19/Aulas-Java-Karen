import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta = 0;
        int op = 0;
        boolean loop = true;
        do {

            try {
                System.out.println("_____________________________" +
                        "\n|         ATIVIDADES        |" +
                        "\n_____________________________");
                while (resposta != 6) {
                    System.out.println("Qual programa você quer visualizar?");
                    System.out.println("\n1: Média Aritimética" +
                            "\n2: Conversor integer para double" +
                            "\n3: Divisores de um número" +
                            "\n4: Dividir dois números" +
                            "\n5: Nome e idade");
                    resposta = sc.nextInt();
                    if (resposta == 1) {

                        int n1, n2, n3, n4, n5, r1, r2;
                        System.out.println("Digite 5 números:");
                        n1 = sc.nextInt();
                        n2 = sc.nextInt();
                        n3 = sc.nextInt();
                        n4 = sc.nextInt();
                        n5 = sc.nextInt();
                        r1 = (n1 + n2 + n3 + n4 + n5);
                        r2 = (n1 + n2 + n3 + n4 + n5) / 2;
                        System.out.println("A soma dos números é " + r1 + " e a média é " + r2 + ".");
                        System.out.println("Deseja escolher outro programa?" +
                                "\n1: Sim;" +
                                "\n2: Não;");
                        op = sc.nextInt();
                        if (op == 1) {
                            System.out.println("Escolha uma opção:");
                        } else if (op == 2) {
                            System.out.println("Obrigado por usar o sistema.");
                            resposta = 6;
                        }

                    } else if (resposta == 2) {
                        System.out.println("Em análise...");
                    } else if(resposta == 3){
                        System.out.println("Digite um número");
                        int num = sc.nextInt();
                        System.out.println("Os divisores desse número são:");
                        int d2,d3,d4,d5;
                        d2 = num%2;
                        d3 =num%3;
                        d4 = num%4;
                        d5 =num%5;
                        if (d2 == 0){
                            System.out.println("2");
                        }if (d3 == 0){
                            System.out.println("3");
                        }if (d4 == 0){
                            System.out.println("4");
                        }if (d5 == 0){
                            System.out.println("5");
                        }else if( d2 == 1 && d3 == 1 && d4 == 1 && d5 == 1 ) {
                            System.out.println("O numero não é divisivel por nenhum numero até o 5.");
                        }
                        System.out.println("Deseja escolher outro programa?" +
                                "\n1: Sim;" +
                                "\n2: Não;");
                        op = sc.nextInt();
                        if (op == 1) {
                            System.out.println("Escolha uma opção:");
                        } else if (op == 2) {
                            System.out.println("Obrigado por usar o sistema.");
                            resposta = 6;
                        }
                    }else if(resposta == 4){
                        System.out.println("Em análise...");
                    }else if (resposta == 5){
                        sc.nextLine();
                        System.out.println("Digite seu nome:");
                        String nome =sc.nextLine();
                        System.out.println("Digite sua idade:");
                        int idade = sc.nextInt();
                            while (idade < 0 || idade > 150){
                                System.out.println("Impossível ter essa idade.5");
                                System.out.println("Digite sua idade:");
                                idade = sc.nextInt();
                                System.out.println();
                            }System.out.println(nome+" você tem "+idade);
                        System.out.println("Deseja escolher outro programa?" +
                                "\n1: Sim;" +
                                "\n2: Não;");
                        op = sc.nextInt();
                        if (op == 1) {
                            System.out.println("Escolha uma opção:");
                        } else if (op == 2) {
                            System.out.println("Obrigado por usar o sistema.");
                            resposta = 6;
                        }
                    }
                }
            }catch (ArithmeticException a) {
                sc.nextLine();
                System.err.print("Erro: " + a);
                System.out.println("\nZero é um denominador invalido.");
                System.out.println("\n deseja tentar novamente?");
                String resp = sc.nextLine();
                if (resp.equalsIgnoreCase("N") ||
                        resp.equalsIgnoreCase("n") ||
                        resp.equalsIgnoreCase("NÃO") ||
                        resp.equalsIgnoreCase("não") ||
                        resp.equalsIgnoreCase("NAO") ||
                        resp.equalsIgnoreCase("nao")) {
                    System.out.println("Programa finalizado");
                    loop = false;
                }
            }catch (InputMismatchException i){
                sc.nextLine();
                System.err.print("Erro: " + i);
                System.out.println("\nCaracter invalido.");
                System.out.println("\nDeseja tentar novamente?");
                String resp = sc.nextLine();
                if (resp.equalsIgnoreCase("N") ||
                        resp.equalsIgnoreCase("n") ||
                        resp.equalsIgnoreCase("NÃO") ||
                        resp.equalsIgnoreCase("não") ||
                        resp.equalsIgnoreCase("NAO") ||
                        resp.equalsIgnoreCase("nao")) {
                    System.out.println("Programa finalizado");
                    loop = false;
                }
            }
        }while (loop);
        }
    }
