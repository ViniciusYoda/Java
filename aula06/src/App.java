import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite n1 ");
        float n1 = teclado.nextFloat();
        System.out.println("Digite n2 ");
        float n2 = teclado.nextFloat();
        float soma = n1 + n2;
        System.out.printf("A nota da soma é %.f", soma);

    }
}
