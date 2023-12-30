import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntEntrada = scanner.nextInt();

        for (int cont = 1; cont <= qntEntrada; cont++) {
            int resultado;
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x += x%2==0? 1: 0;
            System.out.println(x*y + 2*y*(y-1)/2);
        }
        scanner.close();
    }
}