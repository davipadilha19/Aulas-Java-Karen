import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá novato! Esse quiz irá introduzi-lo no mundo " +
                "\ndo RPG de Mesa." +
                "\nNão se preocupe, errar, além de normal, é a proposta do jogo," +
                "\npois assim você irá aprender melhor, A gente aprende mais com os erros." +
                "\nEntão divirta-se." +
                "\nOBS:ESSE QUIZ FOI FEITO COM BASE NO GAIA: O PRELUDIO, UM SISTEMA DE RPG DE MESA" +
                "\nTOTALMENTE BRASILEIRO E FEITO PELA COMUNIDADE RPGISTA. ");
        String espaco = sc.nextLine();
        System.out.println("O que é RPG de Mesa?");
        espaco = sc.nextLine();
        System.out.println("\n1: Um jogo de interpretação de papeis;" +
                "\n2: Um jogo de Video Game que dispensa totalmente a presença de mais pessoas;" +
                "\n3: Um jogo de tabuleiro extremamente complexo que envolme muita lógica, e que apenas pessoas " +
                "\nmuito inteligentes podem jogar.");
        espaco = sc.nextLine();
        //R1
        System.out.println("O que é necessario para jogar RPG de Mesa?");
        espaco = sc.nextLine();
        System.out.println("\n1: Peças e cartas carissimas;" +
                "\n2: Uma ficha de personagem(para cada jogador), lápis, borracha, livro de regras, criatividade " +
                "\ne um kit de dados;" +
                "\n3: Um computador, celular ou console de video game.");
        //R2
        espaco = sc.nextLine();
        System.out.println("Qual o pricipal dado para fazer os testes:(d= dado, o n°=n° de faces" +
                "\n Ex: d10 = dado de 10 lados");
        espaco = sc.nextLine();
        System.out.println("\n1: d6" +
                "\n2: d4" +
                "\n3: d12");
        //R3
        espaco = sc.nextLine();
        System.out.println("Como funciona o sistema de dano de armas básicas no Gaia?");
    }
}
