import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner escolha = new Scanner(System.in);
        Scanner numeroInserido = new Scanner(System.in);

        System.out.print("Digite a escolha: ");
        String escolhaEntrada = escolha.nextLine();

        if (escolhaEntrada.equals("somar")) {
            System.out.print("Digite o primeiro número: ");
            int x = numeroInserido.nextInt();
            System.out.print("Digite o segundo número: ");
            int y = numeroInserido.nextInt();
            sum(x, y);
        }
        if (escolhaEntrada.equals("subtrair")) {
            System.out.print("Digite o primeiro número: ");
            int x = numeroInserido.nextInt();
            System.out.print("Digite o segundo número: ");
            int y = numeroInserido.nextInt();
            sub(x, y);
        }




    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void sub(int x, int y) {
        System.out.println(x - y);
    }

}
