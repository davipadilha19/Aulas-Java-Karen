import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        do{
            try {
                System.out.println("Informe um numerador");
                int numerador = sc.nextInt();
                System.out.println("Informe um denominador");
                int denominador = sc.nextInt();
                int result = numerador/denominador;
                System.out.println("Resultado: "+result);
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