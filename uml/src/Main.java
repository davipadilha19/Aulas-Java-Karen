import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int point = 0;
        System.out.println("Como uma classe é representada?" +
                "\n1: um Triangulo" +
                "\n2: um Retangulo" +
                "\n3: Um Retangulo com três divisões. ");
        int res = sc.nextInt();
        if(res != 3){
            System.out.println("Errado");
        }else {
            System.out.println("Correto");
        }
        System.out.println("Qual a visibilidade que qualquer classe pode ver?" +
                "\n1 Public;" +
                "\n2 Private" +
                "\n3 Protected");
        res = sc.nextInt();
        if(res != 1){
            System.out.println("Errado");
        }else {
            System.out.println("Correto");
            point += 20;
        }
        System.out.println("Qual visibilidade recebe esse simbolo #" +
                " \n1 Public;"+
                "\n2 Private" +
                "\n3 Protected");
        res = sc.nextInt();
        if (res != 3){
            System.out.println("Errado");
        }else{
            System.out.println("Correto");
            point += 20;
        }
        System.out.println("O que compõe uma Classe?" +
                "\n1: Os atributos e os métodos" +
                "\n2:  O nome da classe, os atributos e os métodos" +
                "\n3: Apenas os Atributos");
        res = sc.nextInt();
        if (res != 2){
            System.out.println("Errado");
        }else{
            System.out.println("Correto");
            point += 20;
        }
        System.out.println("O que são métodos?" +
                "\n1 Ações que implementam uma operação" +
                "\n2 Caracteristicas da classe" +
                "\n3 Um titulo ou ação que a classe possui");
        res = sc.nextInt();
        if (res != 1){
            System.out.println("Errado");
        }else {
            System.out.println("Correto");
            point += 20;
        }
        System.out.println("O que são os Atributos de uma classe?" +
                "\n1: Ações que implementam uma operação" +
                "\n2: Caracteristicas da classe" +
                "\n3 O nome da classe.");
        res = sc.nextInt();
        if (res != 2){
            System.out.println("Errado");
        }else {
            System.out.println("Correto");
            point += 20;
        }
        System.out.println("Você recebeu "+ point+" pontos.");
    }
}