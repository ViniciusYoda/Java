import java.time.LocalDate;
import java.util.Scanner;

public class Situacao {
    public static void main(String[] args) throws Exception {
        Scanner tec = new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int nasc = tec.nextInt();
        int ano = LocalDate.now().getYear();
        int idade = ano - nasc;
        String sit = (idade >= 16 && idade <18 || idade > 70) ? "Voto opcional" : "Voto não é opcional";
        System.out.println(sit);
        

    }
}