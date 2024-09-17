
import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args) throws Exception {
        System.out.println("Delta = b² - 4 . a . c");
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor de a: ");
        int a = tec.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = tec.nextInt();
        System.out.println("Digite o valor de c: ");
        int c = tec.nextInt();
        double delta = Math.pow(b,2) - 4 * a * c;
        System.out.println("O valor de delta é igual a: " + delta); 
        if (delta < 0) {
            System.out.println("Não existe raizes reais");
        } else {
            System.out.println("Existe raizes iguais");
        }
    }
}
