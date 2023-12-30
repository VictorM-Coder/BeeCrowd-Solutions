import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int x = scanner.nextInt();
            if (x ==0 ) break;
            x += x%2!=0? 1: 0;
            System.out.println(x + x+2 + x+4 + x+6 + x+8);
        }
        scanner.close();
    }
}