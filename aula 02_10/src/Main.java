import java.util.Scanner;

public class Main {
    public static void menu(){
        System.out.println("Bebidas");
        System.out.println("1. "+Bebida.SODA.getNome()+ " R$"+ Bebida.SODA.getPreco());
        System.out.println("2. "+Bebida.JUICE.getNome()+ " R$"+ Bebida.JUICE.getPreco());
        System.out.println("3. "+Bebida.WATER.getNome()+ " R$"+ Bebida.WATER.getPreco());

        System.out.println("Comida");
        System.out.println("4. "+ Comida.SANDWICH.getNome() + " R$" + Comida.SANDWICH.getPreco());
        System.out.println("5. "+ Comida.HOTDOG.getNome() + " R$" + Comida.HOTDOG.getPreco());
        System.out.println("6. "+ Comida.XBURGER.getNome() + " R$" + Comida.XBURGER.getPreco());

        System.out.println("0. Sair");
        System.out.println("Escolha a sua opção: ");
    }
    public static double preco(int opcao){
        switch (opcao){
            case 1:
                return Bebida.SODA.getPreco();
            case 2:
                return Bebida.JUICE.getPreco();
            case 3:
                return Bebida.WATER.getPreco();
            case 4:
                return Comida.HOTDOG.getPreco();
            case 5:
                return Comida.SANDWICH.getPreco();
            case 6:
                return Comida.XBURGER.getPreco();
            default:
                return 0.0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        int opcao = 0;


        do{
            menu();
            opcao = sc.nextInt();
            total += preco(opcao);

            System.out.println("Opção escolhida: "+opcao);
            System.out.println("Valor total da Sua conta: "+total);
        } while ((opcao!= 0));
    }
}