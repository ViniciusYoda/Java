
import java.util.Scanner;

public class TiposTriangulo {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Valor de a: ");
        int a = tec.nextInt();
        System.out.println("Valor de b: ");
        int b = tec.nextInt();
        System.out.println("Valor de c: ");
        int c = tec.nextInt();
        tec.close();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Forma um triangulo");
            if (a == b && b == c) {
                System.out.println("Equilatero");
            } else if (a != b && b != c && a != c) {
                System.out.println("Escaleno");
            } else {
                System.out.println("Isoceles");
            }
        } else {
            System.out.println("Não forma um triangulo");
        }
    }
}