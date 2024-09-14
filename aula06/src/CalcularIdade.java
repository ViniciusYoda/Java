import java.time.LocalDate;
import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Data de nascimento: ");
        int nasc = teclado.nextInt();
        int ano =  LocalDate.now().getYear();
        float idade = ano - nasc;
        System.out.println("A sua idade é " + idade);

    }
}
