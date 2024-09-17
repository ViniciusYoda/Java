
import java.util.Scanner;

public class ProgramaIdade {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ano de nascimento ");
        int nasc = tec.nextInt();
        int i = 2024 - nasc;
        if (i >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}