import java.util.Scanner;

public class Main {

    public static void encontrarDivisores(int numero) {
       for (int cont  = 1; cont <= numero; cont ++) {
           if (numero % cont == 0) System.out.println(cont);
       }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada = scanner.nextInt();
        encontrarDivisores(entrada);
    }
}
