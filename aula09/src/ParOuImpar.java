
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int n = tec.nextInt();
        int res = n % 2;
        if (res == 0) {
            System.out.println("O numero é par");
        } else {
            System.out.println("O número não é par");
        }
    }
}