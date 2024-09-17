import java.util.Scanner;

public class ProgramaMedia {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        float n1 = tec.nextFloat();
        float n2 = tec.nextFloat();
        float m = (n1 + n2) / 2;
        if (m > 7) {
            System.out.println("Acima da média");
        } else {
            System.out.println("Você tirou abaixod a média");
        }
    }
}